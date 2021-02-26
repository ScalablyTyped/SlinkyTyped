package typingsSlinky.conventionalCommitsParser

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.TopLevel
import typingsSlinky.conventionalCommitsParser.mod.Commit.Field
import typingsSlinky.conventionalCommitsParser.mod.Commit.Note
import typingsSlinky.conventionalCommitsParser.mod.Commit.Reference
import typingsSlinky.conventionalCommitsParser.mod.Commit.Revert
import typingsSlinky.conventionalCommitsParser.mod.Options.Actions
import typingsSlinky.conventionalCommitsParser.mod.Options.Correspondence
import typingsSlinky.conventionalCommitsParser.mod.Options.Keywords
import typingsSlinky.conventionalCommitsParser.mod.Options.Pattern
import typingsSlinky.conventionalCommitsParser.mod.Options.Prefixes
import typingsSlinky.node.streamMod.Transform
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  /**
    * Returns an transform stream. If there is any malformed commits it will be
    * gracefully ignored (an empty data will be emitted so down stream can notice).
    *
    * @param options
    */
  @JSImport("conventional-commits-parser", JSImport.Namespace)
  @js.native
  def apply(): Transform = js.native
  @JSImport("conventional-commits-parser", JSImport.Namespace)
  @js.native
  def apply(options: Options): Transform = js.native
  
  /**
    * The sync version. Useful when parsing a single commit. Returns the result.
    *
    * @param commit  A single commit to be parsed.
    * @param options Same as the `options` of `conventionalCommitsParser`.
    */
  @JSImport("conventional-commits-parser", "sync")
  @js.native
  def sync(commit: String): Commit[String | Double | js.Symbol] = js.native
  @JSImport("conventional-commits-parser", "sync")
  @js.native
  def sync(commit: String, options: Options): Commit[String | Double | js.Symbol] = js.native
  
  object Commit {
    
    type Field = String | Null
    
    @js.native
    trait Note extends StObject {
      
      var text: String = js.native
      
      var title: String = js.native
    }
    object Note {
      
      @scala.inline
      def apply(text: String, title: String): Note = {
        val __obj = js.Dynamic.literal(text = text.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
        __obj.asInstanceOf[Note]
      }
      
      @scala.inline
      implicit class NoteMutableBuilder[Self <: Note] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      }
    }
    
    @js.native
    trait Reference extends StObject {
      
      /**
        * @default
        * null
        */
      var action: Field = js.native
      
      var issue: String = js.native
      
      /**
        * @default
        * null
        */
      var owner: Field = js.native
      
      var prefix: String = js.native
      
      var raw: String = js.native
      
      /**
        * @default
        * null
        */
      var repository: Field = js.native
    }
    object Reference {
      
      @scala.inline
      def apply(issue: String, prefix: String, raw: String): Reference = {
        val __obj = js.Dynamic.literal(issue = issue.asInstanceOf[js.Any], prefix = prefix.asInstanceOf[js.Any], raw = raw.asInstanceOf[js.Any])
        __obj.asInstanceOf[Reference]
      }
      
      @scala.inline
      implicit class ReferenceMutableBuilder[Self <: Reference] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setAction(value: Field): Self = StObject.set(x, "action", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setActionNull: Self = StObject.set(x, "action", null)
        
        @scala.inline
        def setIssue(value: String): Self = StObject.set(x, "issue", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setOwner(value: Field): Self = StObject.set(x, "owner", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setOwnerNull: Self = StObject.set(x, "owner", null)
        
        @scala.inline
        def setPrefix(value: String): Self = StObject.set(x, "prefix", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setRaw(value: String): Self = StObject.set(x, "raw", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setRepository(value: Field): Self = StObject.set(x, "repository", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setRepositoryNull: Self = StObject.set(x, "repository", null)
      }
    }
    
    @js.native
    trait Revert
      extends /* field */ StringDictionary[js.UndefOr[Field]] {
      
      var hash: js.UndefOr[Field] = js.native
      
      var header: js.UndefOr[Field] = js.native
    }
    object Revert {
      
      @scala.inline
      def apply(): Revert = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[Revert]
      }
      
      @scala.inline
      implicit class RevertMutableBuilder[Self <: Revert] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setHash(value: Field): Self = StObject.set(x, "hash", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setHashNull: Self = StObject.set(x, "hash", null)
        
        @scala.inline
        def setHashUndefined: Self = StObject.set(x, "hash", js.undefined)
        
        @scala.inline
        def setHeader(value: Field): Self = StObject.set(x, "header", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setHeaderNull: Self = StObject.set(x, "header", null)
        
        @scala.inline
        def setHeaderUndefined: Self = StObject.set(x, "header", js.undefined)
      }
    }
  }
  type Commit[Fields /* <: String | Double | js.Symbol */] = CommitBase with typingsSlinky.conventionalCommitsParser.conventionalCommitsParserStrings.Commit with TopLevel[js.Any]
  
  @js.native
  trait CommitBase extends StObject {
    
    /**
      * @default
      * null
      */
    var body: Field = js.native
    
    /**
      * @default
      * null
      */
    var footer: Field = js.native
    
    /**
      * @default
      * null
      */
    var header: Field = js.native
    
    /**
      * @default
      * []
      */
    var mentions: js.Array[String] = js.native
    
    /**
      * @default
      * null
      */
    var merge: Field = js.native
    
    /**
      * @default
      * []
      */
    var notes: js.Array[Note] = js.native
    
    /**
      * @default
      * []
      */
    var references: js.Array[Reference] = js.native
    
    /**
      * @default
      * null
      */
    var revert: Revert | Null = js.native
    
    var scope: js.UndefOr[Field] = js.native
    
    var subject: js.UndefOr[Field] = js.native
    
    var `type`: js.UndefOr[Field] = js.native
  }
  object CommitBase {
    
    @scala.inline
    def apply(mentions: js.Array[String], notes: js.Array[Note], references: js.Array[Reference]): CommitBase = {
      val __obj = js.Dynamic.literal(mentions = mentions.asInstanceOf[js.Any], notes = notes.asInstanceOf[js.Any], references = references.asInstanceOf[js.Any])
      __obj.asInstanceOf[CommitBase]
    }
    
    @scala.inline
    implicit class CommitBaseMutableBuilder[Self <: CommitBase] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBody(value: Field): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBodyNull: Self = StObject.set(x, "body", null)
      
      @scala.inline
      def setFooter(value: Field): Self = StObject.set(x, "footer", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFooterNull: Self = StObject.set(x, "footer", null)
      
      @scala.inline
      def setHeader(value: Field): Self = StObject.set(x, "header", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeaderNull: Self = StObject.set(x, "header", null)
      
      @scala.inline
      def setMentions(value: js.Array[String]): Self = StObject.set(x, "mentions", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMentionsVarargs(value: String*): Self = StObject.set(x, "mentions", js.Array(value :_*))
      
      @scala.inline
      def setMerge(value: Field): Self = StObject.set(x, "merge", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMergeNull: Self = StObject.set(x, "merge", null)
      
      @scala.inline
      def setNotes(value: js.Array[Note]): Self = StObject.set(x, "notes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNotesVarargs(value: Note*): Self = StObject.set(x, "notes", js.Array(value :_*))
      
      @scala.inline
      def setReferences(value: js.Array[Reference]): Self = StObject.set(x, "references", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReferencesVarargs(value: Reference*): Self = StObject.set(x, "references", js.Array(value :_*))
      
      @scala.inline
      def setRevert(value: Revert): Self = StObject.set(x, "revert", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRevertNull: Self = StObject.set(x, "revert", null)
      
      @scala.inline
      def setScope(value: Field): Self = StObject.set(x, "scope", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setScopeNull: Self = StObject.set(x, "scope", null)
      
      @scala.inline
      def setScopeUndefined: Self = StObject.set(x, "scope", js.undefined)
      
      @scala.inline
      def setSubject(value: Field): Self = StObject.set(x, "subject", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSubjectNull: Self = StObject.set(x, "subject", null)
      
      @scala.inline
      def setSubjectUndefined: Self = StObject.set(x, "subject", js.undefined)
      
      @scala.inline
      def setType(value: Field): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTypeNull: Self = StObject.set(x, "type", null)
      
      @scala.inline
      def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  @js.native
  trait Options extends StObject {
    
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
    var warn: js.UndefOr[(js.Function1[/* message */ js.UndefOr[js.Any], Unit]) | Boolean] = js.native
  }
  object Options {
    
    @scala.inline
    def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    type Actions = js.Array[String] | String | Null
    
    type Correspondence = js.Array[String] | String | Null
    
    type Keywords = js.Array[String] | String | Null
    
    @scala.inline
    implicit class OptionsMutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCommentChar(value: String): Self = StObject.set(x, "commentChar", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCommentCharNull: Self = StObject.set(x, "commentChar", null)
      
      @scala.inline
      def setCommentCharUndefined: Self = StObject.set(x, "commentChar", js.undefined)
      
      @scala.inline
      def setFieldPattern(value: Pattern): Self = StObject.set(x, "fieldPattern", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFieldPatternNull: Self = StObject.set(x, "fieldPattern", null)
      
      @scala.inline
      def setFieldPatternRegExp(value: js.RegExp): Self = StObject.set(x, "fieldPattern", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFieldPatternUndefined: Self = StObject.set(x, "fieldPattern", js.undefined)
      
      @scala.inline
      def setHeaderCorrespondence(value: Correspondence): Self = StObject.set(x, "headerCorrespondence", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeaderCorrespondenceNull: Self = StObject.set(x, "headerCorrespondence", null)
      
      @scala.inline
      def setHeaderCorrespondenceUndefined: Self = StObject.set(x, "headerCorrespondence", js.undefined)
      
      @scala.inline
      def setHeaderCorrespondenceVarargs(value: String*): Self = StObject.set(x, "headerCorrespondence", js.Array(value :_*))
      
      @scala.inline
      def setHeaderPattern(value: Pattern): Self = StObject.set(x, "headerPattern", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeaderPatternNull: Self = StObject.set(x, "headerPattern", null)
      
      @scala.inline
      def setHeaderPatternRegExp(value: js.RegExp): Self = StObject.set(x, "headerPattern", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeaderPatternUndefined: Self = StObject.set(x, "headerPattern", js.undefined)
      
      @scala.inline
      def setIssuePrefixes(value: Prefixes): Self = StObject.set(x, "issuePrefixes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIssuePrefixesCaseSensitive(value: Boolean): Self = StObject.set(x, "issuePrefixesCaseSensitive", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIssuePrefixesCaseSensitiveUndefined: Self = StObject.set(x, "issuePrefixesCaseSensitive", js.undefined)
      
      @scala.inline
      def setIssuePrefixesNull: Self = StObject.set(x, "issuePrefixes", null)
      
      @scala.inline
      def setIssuePrefixesUndefined: Self = StObject.set(x, "issuePrefixes", js.undefined)
      
      @scala.inline
      def setIssuePrefixesVarargs(value: String*): Self = StObject.set(x, "issuePrefixes", js.Array(value :_*))
      
      @scala.inline
      def setMergeCorrespondence(value: Correspondence): Self = StObject.set(x, "mergeCorrespondence", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMergeCorrespondenceNull: Self = StObject.set(x, "mergeCorrespondence", null)
      
      @scala.inline
      def setMergeCorrespondenceUndefined: Self = StObject.set(x, "mergeCorrespondence", js.undefined)
      
      @scala.inline
      def setMergeCorrespondenceVarargs(value: String*): Self = StObject.set(x, "mergeCorrespondence", js.Array(value :_*))
      
      @scala.inline
      def setMergePattern(value: Pattern): Self = StObject.set(x, "mergePattern", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMergePatternNull: Self = StObject.set(x, "mergePattern", null)
      
      @scala.inline
      def setMergePatternRegExp(value: js.RegExp): Self = StObject.set(x, "mergePattern", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMergePatternUndefined: Self = StObject.set(x, "mergePattern", js.undefined)
      
      @scala.inline
      def setNoteKeywords(value: Keywords): Self = StObject.set(x, "noteKeywords", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNoteKeywordsNull: Self = StObject.set(x, "noteKeywords", null)
      
      @scala.inline
      def setNoteKeywordsUndefined: Self = StObject.set(x, "noteKeywords", js.undefined)
      
      @scala.inline
      def setNoteKeywordsVarargs(value: String*): Self = StObject.set(x, "noteKeywords", js.Array(value :_*))
      
      @scala.inline
      def setReferenceActions(value: Actions): Self = StObject.set(x, "referenceActions", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReferenceActionsNull: Self = StObject.set(x, "referenceActions", null)
      
      @scala.inline
      def setReferenceActionsUndefined: Self = StObject.set(x, "referenceActions", js.undefined)
      
      @scala.inline
      def setReferenceActionsVarargs(value: String*): Self = StObject.set(x, "referenceActions", js.Array(value :_*))
      
      @scala.inline
      def setRevertCorrespondence(value: Correspondence): Self = StObject.set(x, "revertCorrespondence", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRevertCorrespondenceNull: Self = StObject.set(x, "revertCorrespondence", null)
      
      @scala.inline
      def setRevertCorrespondenceUndefined: Self = StObject.set(x, "revertCorrespondence", js.undefined)
      
      @scala.inline
      def setRevertCorrespondenceVarargs(value: String*): Self = StObject.set(x, "revertCorrespondence", js.Array(value :_*))
      
      @scala.inline
      def setRevertPattern(value: Pattern): Self = StObject.set(x, "revertPattern", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRevertPatternNull: Self = StObject.set(x, "revertPattern", null)
      
      @scala.inline
      def setRevertPatternRegExp(value: js.RegExp): Self = StObject.set(x, "revertPattern", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRevertPatternUndefined: Self = StObject.set(x, "revertPattern", js.undefined)
      
      @scala.inline
      def setWarn(value: (js.Function1[/* message */ js.UndefOr[js.Any], Unit]) | Boolean): Self = StObject.set(x, "warn", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWarnFunction1(value: /* message */ js.UndefOr[js.Any] => Unit): Self = StObject.set(x, "warn", js.Any.fromFunction1(value))
      
      @scala.inline
      def setWarnUndefined: Self = StObject.set(x, "warn", js.undefined)
    }
    
    type Pattern = js.RegExp | String | Null
    
    type Prefixes = js.Array[String] | String | Null
  }
}
