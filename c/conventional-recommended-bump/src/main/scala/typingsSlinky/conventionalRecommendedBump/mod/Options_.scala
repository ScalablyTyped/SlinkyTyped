package typingsSlinky.conventionalRecommendedBump.mod

import typingsSlinky.conventionalCommitsParser.mod.Commit
import typingsSlinky.conventionalRecommendedBump.mod.Options.WhatBump
import typingsSlinky.conventionalRecommendedBump.mod.Options.WhatBump.Result
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * `options` is an object with the following properties:
  * * `ignoreReverted`
  * * `preset`
  * * `config`
  * * `whatBump`
  */
@js.native
trait Options_ extends js.Object {
  /**
    * This should serve as default values for other arguments of
    * `conventional-recommended-bump` so you don't need to rewrite the same or
    * similar config across your projects.
    *
    * @remarks
    * `config` option will be overwritten by the value loaded by
    * `conventional-changelog-preset-loader` if the `preset` options is set.
    */
  var config: js.UndefOr[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CoreOptions.Config<Commit, WriterContext> */ js.Any
  ] = js.native
  /**
    * If `true`, reverted commits will be ignored.
    *
    * @default
    * true
    */
  var ignoreReverted: js.UndefOr[Boolean] = js.native
  /**
    * Specify the name of a package in a [Lerna](https://lernajs.io/)-managed
    * repository. The package name will be used when fetching all changes to a
    * package since the last time that package was released.
    *
    * For instance if your project contained a package named
    * `conventional-changelog`, you could have only commits that have happened
    * since the last release of `conventional-changelog` was tagged by
    * specifying `--lernaPackage=conventional-changelog` using the CLI, or
    * `conventional-changelog` as the value of the `lernaPackage` option.
    */
  var lernaPackage: js.UndefOr[String] = js.native
  /**
    * It's recommended to use a preset so you don't have to define everything
    * yourself.
    *
    * The value is passed to [`conventional-changelog-preset-loader`](https://www.npmjs.com/package/conventional-changelog-preset-loader).
    */
  var preset: js.UndefOr[String] = js.native
  /**
    * Specify a prefix for the git tag that will be taken into account during the
    * comparison.
    *
    * For instance if your version tag is prefixed by `version/` instead of `v` you
    * would specifying `--tagPrefix=version/` using the CLI, or `version/` as the
    * value of the `tagPrefix` option.
    */
  var tagPrefix: js.UndefOr[String] = js.native
  /**
    * A function that takes parsed commits as an argument.
    *
    * ```
    * whatBump(commits) {};
    * ```
    *
    * `commits` is an array of all commits from last semver tag to `HEAD` as parsed
    * by `conventional-commits-parser`.
    *
    * This should return an object including but not limited to `level` and `reason`.
    * `level` is a `number` indicating what bump it should be and `reason` is the
    * reason of such release.
    */
  var whatBump: js.UndefOr[WhatBump] = js.native
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
    def withConfig(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CoreOptions.Config<Commit, WriterContext> */ js.Any
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("config")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutConfig: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("config")(js.undefined)
        ret
    }
    @scala.inline
    def withIgnoreReverted(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ignoreReverted")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIgnoreReverted: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ignoreReverted")(js.undefined)
        ret
    }
    @scala.inline
    def withLernaPackage(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lernaPackage")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLernaPackage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lernaPackage")(js.undefined)
        ret
    }
    @scala.inline
    def withPreset(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("preset")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPreset: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("preset")(js.undefined)
        ret
    }
    @scala.inline
    def withTagPrefix(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tagPrefix")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTagPrefix: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tagPrefix")(js.undefined)
        ret
    }
    @scala.inline
    def withWhatBump(value: /* commits */ js.Array[Commit[String | Double | js.Symbol]] => Result): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("whatBump")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutWhatBump: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("whatBump")(js.undefined)
        ret
    }
  }
  
}

