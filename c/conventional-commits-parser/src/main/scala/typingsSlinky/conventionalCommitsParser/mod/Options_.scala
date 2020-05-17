package typingsSlinky.conventionalCommitsParser.mod

import typingsSlinky.conventionalCommitsParser.mod.Options.Actions
import typingsSlinky.conventionalCommitsParser.mod.Options.Correspondence
import typingsSlinky.conventionalCommitsParser.mod.Options.Keywords
import typingsSlinky.conventionalCommitsParser.mod.Options.Pattern
import typingsSlinky.conventionalCommitsParser.mod.Options.Prefixes
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Options_ extends js.Object {
  /**
    * What commentChar to use. By default it is `null`, so no comments are stripped.
    * Set to `#` if you pass the contents of `.git/COMMIT_EDITMSG` directly.
    *
    * If you have configured the git commentchar via git config `core.commentchar`
    * you'll want to pass what you have set there.
    *
    * @default
    * null
    */
  var commentChar: js.UndefOr[String | Null] = js.native
  /**
    * Pattern to match other fields.
    *
    * @default
    * /^-(.*?)-$/
    */
  var fieldPattern: js.UndefOr[Pattern] = js.native
  /**
    * Used to define what capturing group of `headerPattern` captures what header
    * part. The order of the array should correspond to the order of
    * `headerPattern`'s capturing group. If the part is not captured it is `null`.
    * If it's a `string` it will be converted to an `array` separated by a comma.
    *
    * @default
    * ['type', 'scope', 'subject']
    */
  var headerCorrespondence: js.UndefOr[Correspondence] = js.native
  /**
    * Used to match header pattern.
    *
    * @default
    * /^(\w*)(?:\(([\w\$\.\-\* ]*)\))?\: (.*)$/
    */
  var headerPattern: js.UndefOr[Pattern] = js.native
  /**
    * The prefixes of an issue. EG: In `gh-123` `gh-` is the prefix.
    *
    * @default
    * ['#']
    */
  var issuePrefixes: js.UndefOr[Prefixes] = js.native
  /**
    * Used to define if `issuePrefixes` should be considered case sensitive.
    *
    * @default
    * false
    */
  var issuePrefixesCaseSensitive: js.UndefOr[Boolean] = js.native
  /**
    * Used to define what capturing group of `mergePattern`.
    *
    * If it's a `string` it will be converted to an `array` separated by a comma.
    *
    * @default
    * null
    */
  var mergeCorrespondence: js.UndefOr[Correspondence] = js.native
  /**
    * Pattern to match merge headers. EG: branch merge, GitHub or GitLab like pull
    * requests headers. When a merge header is parsed, the next line is used for
    * conventional header parsing.
    *
    * For example, if we have a commit
    *
    * ```text
    * Merge pull request #1 from user/feature/feature-name
    *
    * feat(scope): broadcast $destroy event on scope destruction
    * ```
    *
    * We can parse it with these options and the default headerPattern:
    *
    * ```javascript
    * {
    *  mergePattern: /^Merge pull request #(\d+) from (.*)$/,
    *  mergeCorrespondence: ['id', 'source']
    * }
    * ```
    *
    * @default
    * null
    */
  var mergePattern: js.UndefOr[Pattern] = js.native
  /**
    * Keywords for important notes. This value is case __insensitive__. If it's a
    * `string` it will be converted to an `array` separated by a comma.
    *
    * @default
    * ['BREAKING CHANGE']
    */
  var noteKeywords: js.UndefOr[Keywords] = js.native
  /**
    * Keywords to reference an issue. This value is case __insensitive__. If it's a
    * `string` it will be converted to an `array` separated by a comma.
    *
    * Set it to `null` to reference an issue without any action.
    *
    * @default
    * ['close', 'closes', 'closed', 'fix', 'fixes', 'fixed', 'resolve', 'resolves', 'resolved']
    */
  var referenceActions: js.UndefOr[Actions] = js.native
  /**
    * Used to define what capturing group of `revertPattern` captures what reverted
    * commit fields. The order of the array should correspond to the order of
    * `revertPattern`'s capturing group.
    *
    * For example, if we had commit
    *
    * ```
    * Revert "throw an error if a callback is passed"
    *
    * This reverts commit 9bb4d6c.
    * ```
    *
    * If configured correctly, the parsed result would be
    *
    * ```
    * {
    *  revert: {
    *    header: 'throw an error if a callback is passed',
    *    hash: '9bb4d6c'
    *  }
    * }
    * ```
    *
    * It implies that this commit reverts a commit with header `'throw an error if
    * a callback is passed'` and hash `'9bb4d6c'`.
    *
    * If it's a `string` it will be converted to an `array` separated by a comma.
    *
    * @default
    * ['header', 'hash']
    */
  var revertCorrespondence: js.UndefOr[Correspondence] = js.native
  /**
    * Pattern to match what this commit reverts.
    *
    * @default
    * /^Revert\s"([\s\S]*)"\s*This reverts commit (\w*)\./
    */
  var revertPattern: js.UndefOr[Pattern] = js.native
  /**
    * What warn function to use. For example, `console.warn.bind(console)` or
    * `grunt.log.writeln`. By default, it's a noop. If it is `true`, it will error
    * if commit cannot be parsed (strict).
    *
    * @default
    * function () {}
    */
  var warn: js.UndefOr[js.Function1[/* message */ js.UndefOr[js.Any], Unit | Boolean]] = js.native
}

object Options_ {
  @scala.inline
  def apply(): Options_ = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Options_]
  }
  @scala.inline
  implicit class Options_Ops[Self <: Options_] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCommentChar(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("commentChar")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCommentChar: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("commentChar")(js.undefined)
        ret
    }
    @scala.inline
    def withCommentCharNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("commentChar")(null)
        ret
    }
    @scala.inline
    def withFieldPatternRegExp(value: js.RegExp): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fieldPattern")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFieldPattern(value: Pattern): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fieldPattern")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFieldPattern: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fieldPattern")(js.undefined)
        ret
    }
    @scala.inline
    def withFieldPatternNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fieldPattern")(null)
        ret
    }
    @scala.inline
    def withHeaderCorrespondence(value: Correspondence): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("headerCorrespondence")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHeaderCorrespondence: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("headerCorrespondence")(js.undefined)
        ret
    }
    @scala.inline
    def withHeaderCorrespondenceNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("headerCorrespondence")(null)
        ret
    }
    @scala.inline
    def withHeaderPatternRegExp(value: js.RegExp): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("headerPattern")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHeaderPattern(value: Pattern): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("headerPattern")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHeaderPattern: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("headerPattern")(js.undefined)
        ret
    }
    @scala.inline
    def withHeaderPatternNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("headerPattern")(null)
        ret
    }
    @scala.inline
    def withIssuePrefixes(value: Prefixes): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("issuePrefixes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIssuePrefixes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("issuePrefixes")(js.undefined)
        ret
    }
    @scala.inline
    def withIssuePrefixesNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("issuePrefixes")(null)
        ret
    }
    @scala.inline
    def withIssuePrefixesCaseSensitive(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("issuePrefixesCaseSensitive")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIssuePrefixesCaseSensitive: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("issuePrefixesCaseSensitive")(js.undefined)
        ret
    }
    @scala.inline
    def withMergeCorrespondence(value: Correspondence): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mergeCorrespondence")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMergeCorrespondence: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mergeCorrespondence")(js.undefined)
        ret
    }
    @scala.inline
    def withMergeCorrespondenceNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mergeCorrespondence")(null)
        ret
    }
    @scala.inline
    def withMergePatternRegExp(value: js.RegExp): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mergePattern")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMergePattern(value: Pattern): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mergePattern")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMergePattern: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mergePattern")(js.undefined)
        ret
    }
    @scala.inline
    def withMergePatternNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mergePattern")(null)
        ret
    }
    @scala.inline
    def withNoteKeywords(value: Keywords): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("noteKeywords")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNoteKeywords: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("noteKeywords")(js.undefined)
        ret
    }
    @scala.inline
    def withNoteKeywordsNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("noteKeywords")(null)
        ret
    }
    @scala.inline
    def withReferenceActions(value: Actions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("referenceActions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReferenceActions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("referenceActions")(js.undefined)
        ret
    }
    @scala.inline
    def withReferenceActionsNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("referenceActions")(null)
        ret
    }
    @scala.inline
    def withRevertCorrespondence(value: Correspondence): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("revertCorrespondence")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRevertCorrespondence: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("revertCorrespondence")(js.undefined)
        ret
    }
    @scala.inline
    def withRevertCorrespondenceNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("revertCorrespondence")(null)
        ret
    }
    @scala.inline
    def withRevertPatternRegExp(value: js.RegExp): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("revertPattern")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRevertPattern(value: Pattern): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("revertPattern")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRevertPattern: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("revertPattern")(js.undefined)
        ret
    }
    @scala.inline
    def withRevertPatternNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("revertPattern")(null)
        ret
    }
    @scala.inline
    def withWarn(value: /* message */ js.UndefOr[js.Any] => Unit | Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("warn")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutWarn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("warn")(js.undefined)
        ret
    }
  }
  
}

