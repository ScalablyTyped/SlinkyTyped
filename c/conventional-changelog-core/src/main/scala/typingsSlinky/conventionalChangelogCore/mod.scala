package typingsSlinky.conventionalChangelogCore

import typingsSlinky.conventionalChangelogCore.anon.ReadonlyPartialPackage
import typingsSlinky.conventionalChangelogCore.mod.MergedContext.ExtraContext
import typingsSlinky.conventionalChangelogCore.mod.Options.Config
import typingsSlinky.conventionalChangelogCore.mod.Options.Config.FunctionType.Callback
import typingsSlinky.conventionalChangelogCore.mod.Options.Logger
import typingsSlinky.conventionalChangelogCore.mod.Options.Pkg
import typingsSlinky.conventionalChangelogCore.mod.Options.Transform
import typingsSlinky.conventionalCommitsParser.mod.Commit
import typingsSlinky.gitRawCommits.mod.GitOptions
import typingsSlinky.node.streamMod.Readable
import typingsSlinky.std.Partial
import typingsSlinky.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  /**
    * Returns a readable stream.
    *
    * @param options
    * @param context
    * @param gitRawCommitsOpts
    * @param parserOpts
    * @param writerOpts
    */
  // tslint:disable-next-line max-line-length
  @JSImport("conventional-changelog-core", JSImport.Namespace)
  @js.native
  def apply[TCommit /* <: Commit[String | Double | js.Symbol] */, TContext /* <: typingsSlinky.conventionalChangelogWriter.mod.Context */](): Readable = js.native
  @JSImport("conventional-changelog-core", JSImport.Namespace)
  @js.native
  def apply[TCommit /* <: Commit[String | Double | js.Symbol] */, TContext /* <: typingsSlinky.conventionalChangelogWriter.mod.Context */](
    options: js.UndefOr[scala.Nothing],
    context: js.UndefOr[scala.Nothing],
    gitRawCommitsOpts: js.UndefOr[scala.Nothing],
    parserOpts: js.UndefOr[scala.Nothing],
    writerOpts: WriterOptions[TCommit, TContext]
  ): Readable = js.native
  @JSImport("conventional-changelog-core", JSImport.Namespace)
  @js.native
  def apply[TCommit /* <: Commit[String | Double | js.Symbol] */, TContext /* <: typingsSlinky.conventionalChangelogWriter.mod.Context */](
    options: js.UndefOr[scala.Nothing],
    context: js.UndefOr[scala.Nothing],
    gitRawCommitsOpts: js.UndefOr[scala.Nothing],
    parserOpts: ParserOptions
  ): Readable = js.native
  @JSImport("conventional-changelog-core", JSImport.Namespace)
  @js.native
  def apply[TCommit /* <: Commit[String | Double | js.Symbol] */, TContext /* <: typingsSlinky.conventionalChangelogWriter.mod.Context */](
    options: js.UndefOr[scala.Nothing],
    context: js.UndefOr[scala.Nothing],
    gitRawCommitsOpts: js.UndefOr[scala.Nothing],
    parserOpts: ParserOptions,
    writerOpts: WriterOptions[TCommit, TContext]
  ): Readable = js.native
  @JSImport("conventional-changelog-core", JSImport.Namespace)
  @js.native
  def apply[TCommit /* <: Commit[String | Double | js.Symbol] */, TContext /* <: typingsSlinky.conventionalChangelogWriter.mod.Context */](
    options: js.UndefOr[scala.Nothing],
    context: js.UndefOr[scala.Nothing],
    gitRawCommitsOpts: GitRawCommitsOptions
  ): Readable = js.native
  @JSImport("conventional-changelog-core", JSImport.Namespace)
  @js.native
  def apply[TCommit /* <: Commit[String | Double | js.Symbol] */, TContext /* <: typingsSlinky.conventionalChangelogWriter.mod.Context */](
    options: js.UndefOr[scala.Nothing],
    context: js.UndefOr[scala.Nothing],
    gitRawCommitsOpts: GitRawCommitsOptions,
    parserOpts: js.UndefOr[scala.Nothing],
    writerOpts: WriterOptions[TCommit, TContext]
  ): Readable = js.native
  @JSImport("conventional-changelog-core", JSImport.Namespace)
  @js.native
  def apply[TCommit /* <: Commit[String | Double | js.Symbol] */, TContext /* <: typingsSlinky.conventionalChangelogWriter.mod.Context */](
    options: js.UndefOr[scala.Nothing],
    context: js.UndefOr[scala.Nothing],
    gitRawCommitsOpts: GitRawCommitsOptions,
    parserOpts: ParserOptions
  ): Readable = js.native
  @JSImport("conventional-changelog-core", JSImport.Namespace)
  @js.native
  def apply[TCommit /* <: Commit[String | Double | js.Symbol] */, TContext /* <: typingsSlinky.conventionalChangelogWriter.mod.Context */](
    options: js.UndefOr[scala.Nothing],
    context: js.UndefOr[scala.Nothing],
    gitRawCommitsOpts: GitRawCommitsOptions,
    parserOpts: ParserOptions,
    writerOpts: WriterOptions[TCommit, TContext]
  ): Readable = js.native
  @JSImport("conventional-changelog-core", JSImport.Namespace)
  @js.native
  def apply[TCommit /* <: Commit[String | Double | js.Symbol] */, TContext /* <: typingsSlinky.conventionalChangelogWriter.mod.Context */](options: js.UndefOr[scala.Nothing], context: Partial[TContext]): Readable = js.native
  @JSImport("conventional-changelog-core", JSImport.Namespace)
  @js.native
  def apply[TCommit /* <: Commit[String | Double | js.Symbol] */, TContext /* <: typingsSlinky.conventionalChangelogWriter.mod.Context */](
    options: js.UndefOr[scala.Nothing],
    context: Partial[TContext],
    gitRawCommitsOpts: js.UndefOr[scala.Nothing],
    parserOpts: js.UndefOr[scala.Nothing],
    writerOpts: WriterOptions[TCommit, TContext]
  ): Readable = js.native
  @JSImport("conventional-changelog-core", JSImport.Namespace)
  @js.native
  def apply[TCommit /* <: Commit[String | Double | js.Symbol] */, TContext /* <: typingsSlinky.conventionalChangelogWriter.mod.Context */](
    options: js.UndefOr[scala.Nothing],
    context: Partial[TContext],
    gitRawCommitsOpts: js.UndefOr[scala.Nothing],
    parserOpts: ParserOptions
  ): Readable = js.native
  @JSImport("conventional-changelog-core", JSImport.Namespace)
  @js.native
  def apply[TCommit /* <: Commit[String | Double | js.Symbol] */, TContext /* <: typingsSlinky.conventionalChangelogWriter.mod.Context */](
    options: js.UndefOr[scala.Nothing],
    context: Partial[TContext],
    gitRawCommitsOpts: js.UndefOr[scala.Nothing],
    parserOpts: ParserOptions,
    writerOpts: WriterOptions[TCommit, TContext]
  ): Readable = js.native
  @JSImport("conventional-changelog-core", JSImport.Namespace)
  @js.native
  def apply[TCommit /* <: Commit[String | Double | js.Symbol] */, TContext /* <: typingsSlinky.conventionalChangelogWriter.mod.Context */](
    options: js.UndefOr[scala.Nothing],
    context: Partial[TContext],
    gitRawCommitsOpts: GitRawCommitsOptions
  ): Readable = js.native
  @JSImport("conventional-changelog-core", JSImport.Namespace)
  @js.native
  def apply[TCommit /* <: Commit[String | Double | js.Symbol] */, TContext /* <: typingsSlinky.conventionalChangelogWriter.mod.Context */](
    options: js.UndefOr[scala.Nothing],
    context: Partial[TContext],
    gitRawCommitsOpts: GitRawCommitsOptions,
    parserOpts: js.UndefOr[scala.Nothing],
    writerOpts: WriterOptions[TCommit, TContext]
  ): Readable = js.native
  @JSImport("conventional-changelog-core", JSImport.Namespace)
  @js.native
  def apply[TCommit /* <: Commit[String | Double | js.Symbol] */, TContext /* <: typingsSlinky.conventionalChangelogWriter.mod.Context */](
    options: js.UndefOr[scala.Nothing],
    context: Partial[TContext],
    gitRawCommitsOpts: GitRawCommitsOptions,
    parserOpts: ParserOptions
  ): Readable = js.native
  @JSImport("conventional-changelog-core", JSImport.Namespace)
  @js.native
  def apply[TCommit /* <: Commit[String | Double | js.Symbol] */, TContext /* <: typingsSlinky.conventionalChangelogWriter.mod.Context */](
    options: js.UndefOr[scala.Nothing],
    context: Partial[TContext],
    gitRawCommitsOpts: GitRawCommitsOptions,
    parserOpts: ParserOptions,
    writerOpts: WriterOptions[TCommit, TContext]
  ): Readable = js.native
  @JSImport("conventional-changelog-core", JSImport.Namespace)
  @js.native
  def apply[TCommit /* <: Commit[String | Double | js.Symbol] */, TContext /* <: typingsSlinky.conventionalChangelogWriter.mod.Context */](options: Options[TCommit, TContext]): Readable = js.native
  @JSImport("conventional-changelog-core", JSImport.Namespace)
  @js.native
  def apply[TCommit /* <: Commit[String | Double | js.Symbol] */, TContext /* <: typingsSlinky.conventionalChangelogWriter.mod.Context */](
    options: Options[TCommit, TContext],
    context: js.UndefOr[scala.Nothing],
    gitRawCommitsOpts: js.UndefOr[scala.Nothing],
    parserOpts: js.UndefOr[scala.Nothing],
    writerOpts: WriterOptions[TCommit, TContext]
  ): Readable = js.native
  @JSImport("conventional-changelog-core", JSImport.Namespace)
  @js.native
  def apply[TCommit /* <: Commit[String | Double | js.Symbol] */, TContext /* <: typingsSlinky.conventionalChangelogWriter.mod.Context */](
    options: Options[TCommit, TContext],
    context: js.UndefOr[scala.Nothing],
    gitRawCommitsOpts: js.UndefOr[scala.Nothing],
    parserOpts: ParserOptions
  ): Readable = js.native
  @JSImport("conventional-changelog-core", JSImport.Namespace)
  @js.native
  def apply[TCommit /* <: Commit[String | Double | js.Symbol] */, TContext /* <: typingsSlinky.conventionalChangelogWriter.mod.Context */](
    options: Options[TCommit, TContext],
    context: js.UndefOr[scala.Nothing],
    gitRawCommitsOpts: js.UndefOr[scala.Nothing],
    parserOpts: ParserOptions,
    writerOpts: WriterOptions[TCommit, TContext]
  ): Readable = js.native
  @JSImport("conventional-changelog-core", JSImport.Namespace)
  @js.native
  def apply[TCommit /* <: Commit[String | Double | js.Symbol] */, TContext /* <: typingsSlinky.conventionalChangelogWriter.mod.Context */](
    options: Options[TCommit, TContext],
    context: js.UndefOr[scala.Nothing],
    gitRawCommitsOpts: GitRawCommitsOptions
  ): Readable = js.native
  @JSImport("conventional-changelog-core", JSImport.Namespace)
  @js.native
  def apply[TCommit /* <: Commit[String | Double | js.Symbol] */, TContext /* <: typingsSlinky.conventionalChangelogWriter.mod.Context */](
    options: Options[TCommit, TContext],
    context: js.UndefOr[scala.Nothing],
    gitRawCommitsOpts: GitRawCommitsOptions,
    parserOpts: js.UndefOr[scala.Nothing],
    writerOpts: WriterOptions[TCommit, TContext]
  ): Readable = js.native
  @JSImport("conventional-changelog-core", JSImport.Namespace)
  @js.native
  def apply[TCommit /* <: Commit[String | Double | js.Symbol] */, TContext /* <: typingsSlinky.conventionalChangelogWriter.mod.Context */](
    options: Options[TCommit, TContext],
    context: js.UndefOr[scala.Nothing],
    gitRawCommitsOpts: GitRawCommitsOptions,
    parserOpts: ParserOptions
  ): Readable = js.native
  @JSImport("conventional-changelog-core", JSImport.Namespace)
  @js.native
  def apply[TCommit /* <: Commit[String | Double | js.Symbol] */, TContext /* <: typingsSlinky.conventionalChangelogWriter.mod.Context */](
    options: Options[TCommit, TContext],
    context: js.UndefOr[scala.Nothing],
    gitRawCommitsOpts: GitRawCommitsOptions,
    parserOpts: ParserOptions,
    writerOpts: WriterOptions[TCommit, TContext]
  ): Readable = js.native
  @JSImport("conventional-changelog-core", JSImport.Namespace)
  @js.native
  def apply[TCommit /* <: Commit[String | Double | js.Symbol] */, TContext /* <: typingsSlinky.conventionalChangelogWriter.mod.Context */](options: Options[TCommit, TContext], context: Partial[TContext]): Readable = js.native
  @JSImport("conventional-changelog-core", JSImport.Namespace)
  @js.native
  def apply[TCommit /* <: Commit[String | Double | js.Symbol] */, TContext /* <: typingsSlinky.conventionalChangelogWriter.mod.Context */](
    options: Options[TCommit, TContext],
    context: Partial[TContext],
    gitRawCommitsOpts: js.UndefOr[scala.Nothing],
    parserOpts: js.UndefOr[scala.Nothing],
    writerOpts: WriterOptions[TCommit, TContext]
  ): Readable = js.native
  @JSImport("conventional-changelog-core", JSImport.Namespace)
  @js.native
  def apply[TCommit /* <: Commit[String | Double | js.Symbol] */, TContext /* <: typingsSlinky.conventionalChangelogWriter.mod.Context */](
    options: Options[TCommit, TContext],
    context: Partial[TContext],
    gitRawCommitsOpts: js.UndefOr[scala.Nothing],
    parserOpts: ParserOptions
  ): Readable = js.native
  @JSImport("conventional-changelog-core", JSImport.Namespace)
  @js.native
  def apply[TCommit /* <: Commit[String | Double | js.Symbol] */, TContext /* <: typingsSlinky.conventionalChangelogWriter.mod.Context */](
    options: Options[TCommit, TContext],
    context: Partial[TContext],
    gitRawCommitsOpts: js.UndefOr[scala.Nothing],
    parserOpts: ParserOptions,
    writerOpts: WriterOptions[TCommit, TContext]
  ): Readable = js.native
  @JSImport("conventional-changelog-core", JSImport.Namespace)
  @js.native
  def apply[TCommit /* <: Commit[String | Double | js.Symbol] */, TContext /* <: typingsSlinky.conventionalChangelogWriter.mod.Context */](
    options: Options[TCommit, TContext],
    context: Partial[TContext],
    gitRawCommitsOpts: GitRawCommitsOptions
  ): Readable = js.native
  @JSImport("conventional-changelog-core", JSImport.Namespace)
  @js.native
  def apply[TCommit /* <: Commit[String | Double | js.Symbol] */, TContext /* <: typingsSlinky.conventionalChangelogWriter.mod.Context */](
    options: Options[TCommit, TContext],
    context: Partial[TContext],
    gitRawCommitsOpts: GitRawCommitsOptions,
    parserOpts: js.UndefOr[scala.Nothing],
    writerOpts: WriterOptions[TCommit, TContext]
  ): Readable = js.native
  @JSImport("conventional-changelog-core", JSImport.Namespace)
  @js.native
  def apply[TCommit /* <: Commit[String | Double | js.Symbol] */, TContext /* <: typingsSlinky.conventionalChangelogWriter.mod.Context */](
    options: Options[TCommit, TContext],
    context: Partial[TContext],
    gitRawCommitsOpts: GitRawCommitsOptions,
    parserOpts: ParserOptions
  ): Readable = js.native
  @JSImport("conventional-changelog-core", JSImport.Namespace)
  @js.native
  def apply[TCommit /* <: Commit[String | Double | js.Symbol] */, TContext /* <: typingsSlinky.conventionalChangelogWriter.mod.Context */](
    options: Options[TCommit, TContext],
    context: Partial[TContext],
    gitRawCommitsOpts: GitRawCommitsOptions,
    parserOpts: ParserOptions,
    writerOpts: WriterOptions[TCommit, TContext]
  ): Readable = js.native
  
  @js.native
  trait Context
    extends typingsSlinky.conventionalChangelogWriter.mod.Context {
    
    /**
      * @defaults
      * Current semver tag or `'v'` + version if no current tag.
      */
    var currentTag: js.UndefOr[String] = js.native
    
    /**
      * Should link to the page that compares current tag with previous tag?
      *
      * @defaults
      * `true` if `previousTag` and `currentTag` are truthy.
      */
    var linkCompare: js.UndefOr[Boolean] = js.native
    
    /**
      * @defaults
      * Previous semver tag or the first commit hash if no previous tag.
      */
    var previousTag: js.UndefOr[String] = js.native
  }
  object Context {
    
    @scala.inline
    def apply(commit: String, date: String, issue: String): Context = {
      val __obj = js.Dynamic.literal(commit = commit.asInstanceOf[js.Any], date = date.asInstanceOf[js.Any], issue = issue.asInstanceOf[js.Any])
      __obj.asInstanceOf[Context]
    }
    
    @scala.inline
    implicit class ContextMutableBuilder[Self <: Context] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCurrentTag(value: String): Self = StObject.set(x, "currentTag", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCurrentTagUndefined: Self = StObject.set(x, "currentTag", js.undefined)
      
      @scala.inline
      def setLinkCompare(value: Boolean): Self = StObject.set(x, "linkCompare", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLinkCompareUndefined: Self = StObject.set(x, "linkCompare", js.undefined)
      
      @scala.inline
      def setPreviousTag(value: String): Self = StObject.set(x, "previousTag", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPreviousTagUndefined: Self = StObject.set(x, "previousTag", js.undefined)
    }
  }
  
  /**
    * Please check the available options at http://git-scm.com/docs/git-log.
    *
    * There are some defaults:
    *
    * @remarks
    * Single dash arguments are not supported because of https://github.com/sindresorhus/dargs/blob/master/index.js#L5.
    *
    * @remarks
    * For `<revision range>` we can also use `<from>..<to>` pattern, and this
    * module has the following extra options for shortcut of this pattern:
    *
    * * `from`
    * * `to`
    *
    * This module also have the following additions:
    *
    * * `format`
    * * `debug`
    * * `path`
    */
  @js.native
  trait GitRawCommitsOptions extends GitOptions {
    
    /**
      * @defaults
      * `true` if `options.append` is truthy.
      */
    var reverse: js.UndefOr[Boolean] = js.native
  }
  object GitRawCommitsOptions {
    
    @scala.inline
    def apply(): GitRawCommitsOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[GitRawCommitsOptions]
    }
    
    @scala.inline
    implicit class GitRawCommitsOptionsMutableBuilder[Self <: GitRawCommitsOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setReverse(value: Boolean): Self = StObject.set(x, "reverse", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReverseUndefined: Self = StObject.set(x, "reverse", js.undefined)
    }
  }
  
  object MergedContext {
    
    @js.native
    trait ExtraContext extends StObject {
      
      /**
        * All git semver tags found in the repository. You can't overwrite this value.
        */
      val gitSemverTags: js.UndefOr[js.Array[String]] = js.native
      
      /**
        * Your `package.json` data. You can't overwrite this value.
        */
      val packageData: js.UndefOr[ReadonlyPartialPackage] = js.native
    }
    object ExtraContext {
      
      @scala.inline
      def apply(): ExtraContext = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[ExtraContext]
      }
      
      @scala.inline
      implicit class ExtraContextMutableBuilder[Self <: ExtraContext] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setGitSemverTags(value: js.Array[String]): Self = StObject.set(x, "gitSemverTags", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setGitSemverTagsUndefined: Self = StObject.set(x, "gitSemverTags", js.undefined)
        
        @scala.inline
        def setGitSemverTagsVarargs(value: String*): Self = StObject.set(x, "gitSemverTags", js.Array(value :_*))
        
        @scala.inline
        def setPackageData(value: ReadonlyPartialPackage): Self = StObject.set(x, "packageData", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setPackageDataUndefined: Self = StObject.set(x, "packageData", js.undefined)
      }
    }
  }
  type MergedContext[T /* <: typingsSlinky.conventionalChangelogWriter.mod.Context */] = T with ExtraContext
  
  @js.native
  trait Options[TCommit /* <: Commit[String | Double | js.Symbol] */, TContext /* <: typingsSlinky.conventionalChangelogWriter.mod.Context */] extends StObject {
    
    /**
      * Should the log be appended to existing data.
      *
      * @default
      * false
      */
    var append: js.UndefOr[Boolean] = js.native
    
    /**
      * This should serve as default values for other arguments of
      * `conventionalChangelogCore` so you don't need to rewrite the same or similar
      * config across your projects. Any value in this could be overwritten. If this
      * is a promise (recommended if async), it should resolve with the config. If
      * this is a function, it expects a node style callback with the config object.
      * If this is an object, it is the config object. The config object should
      * include `context`, `gitRawCommitsOpts`, `parserOpts` and `writerOpts`.
      */
    var config: js.UndefOr[Config[TCommit, TContext]] = js.native
    
    /**
      * A debug function. EG: `console.debug.bind(console)`.
      *
      * @default
      * function () {}
      */
    var debug: js.UndefOr[Logger] = js.native
    
    /**
      * Specify a package in lerna-style monorepo that the CHANGELOG should be
      * generated for.
      *
      * Lerna tags releases in the format `foo-package@1.0.0` and assumes that
      * packages are stored in the directory structure `./packages/foo-package`.
      *
      * @default
      * null
      */
    var lernaPackage: js.UndefOr[String | Null] = js.native
    
    /**
      * If this value is `true` and `context.version` equals last release then
      * `context.version` will be changed to `'Unreleased'`.
      *
      * @remarks
      * You may want to combine this option with `releaseCount` set to `0` to always
      * overwrite the whole CHANGELOG. `conventional-changelog` only outputs a
      * CHANGELOG but doesn't read any existing one.
      *
      * @defaults
      * `true` if a different version than last release is given. Otherwise `false`.
      */
    var outputUnreleased: js.UndefOr[Boolean] = js.native
    
    var pkg: js.UndefOr[Pkg] = js.native
    
    /**
      * How many releases of changelog you want to generate. It counts from the
      * upcoming release. Useful when you forgot to generate any previous changelog.
      * Set to `0` to regenerate all.
      *
      * @default
      * 1
      */
    var releaseCount: js.UndefOr[Double] = js.native
    
    /**
      * Specify a prefix for the git tag that will be taken into account during the
      * comparison. For instance if your version tag is prefixed by `version/`
      * instead of `v` you would specify `--tagPrefix=version/`.
      */
    var tagPrefix: js.UndefOr[String] = js.native
    
    /**
      * A transform function that applies after the parser and before the writer.
      *
      * This is the place to modify the parsed commits.
      */
    var transform: js.UndefOr[Transform[TCommit]] = js.native
    
    /**
      * A warn function. EG: `grunt.verbose.writeln`.
      *
      * @default
      * options.debug
      */
    var warn: js.UndefOr[Logger] = js.native
  }
  object Options {
    
    @scala.inline
    def apply[TCommit /* <: Commit[String | Double | js.Symbol] */, TContext /* <: typingsSlinky.conventionalChangelogWriter.mod.Context */](): Options[TCommit, TContext] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options[TCommit, TContext]]
    }
    
    object Config {
      
      object FunctionType {
        
        type Callback[TCommit /* <: Commit[String | Double | js.Symbol] */, TContext /* <: typingsSlinky.conventionalChangelogWriter.mod.Context */] = js.Function2[/* error */ js.Any, /* config */ ObjectType[TCommit, TContext], Unit]
      }
      type FunctionType[TCommit /* <: Commit[String | Double | js.Symbol] */, TContext /* <: typingsSlinky.conventionalChangelogWriter.mod.Context */] = js.Function1[/* callback */ Callback[TCommit, TContext], Unit]
      
      @js.native
      trait ObjectType[TCommit /* <: Commit[String | Double | js.Symbol] */, TContext /* <: typingsSlinky.conventionalChangelogWriter.mod.Context */] extends StObject {
        
        var context: js.UndefOr[Partial[TContext]] = js.native
        
        var gitRawCommitsOpts: js.UndefOr[GitRawCommitsOptions] = js.native
        
        var parserOpts: js.UndefOr[ParserOptions] = js.native
        
        var recommendedBumpOpts: js.UndefOr[typingsSlinky.conventionalRecommendedBump.mod.Options] = js.native
        
        var writerOpts: js.UndefOr[WriterOptions[TCommit, TContext]] = js.native
      }
      object ObjectType {
        
        @scala.inline
        def apply[TCommit /* <: Commit[String | Double | js.Symbol] */, TContext /* <: typingsSlinky.conventionalChangelogWriter.mod.Context */](): ObjectType[TCommit, TContext] = {
          val __obj = js.Dynamic.literal()
          __obj.asInstanceOf[ObjectType[TCommit, TContext]]
        }
        
        @scala.inline
        implicit class ObjectTypeMutableBuilder[Self <: ObjectType[_, _], TCommit /* <: Commit[String | Double | js.Symbol] */, TContext /* <: typingsSlinky.conventionalChangelogWriter.mod.Context */] (val x: Self with (ObjectType[TCommit, TContext])) extends AnyVal {
          
          @scala.inline
          def setContext(value: Partial[TContext]): Self = StObject.set(x, "context", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setContextUndefined: Self = StObject.set(x, "context", js.undefined)
          
          @scala.inline
          def setGitRawCommitsOpts(value: GitRawCommitsOptions): Self = StObject.set(x, "gitRawCommitsOpts", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setGitRawCommitsOptsUndefined: Self = StObject.set(x, "gitRawCommitsOpts", js.undefined)
          
          @scala.inline
          def setParserOpts(value: ParserOptions): Self = StObject.set(x, "parserOpts", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setParserOptsUndefined: Self = StObject.set(x, "parserOpts", js.undefined)
          
          @scala.inline
          def setRecommendedBumpOpts(value: typingsSlinky.conventionalRecommendedBump.mod.Options): Self = StObject.set(x, "recommendedBumpOpts", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setRecommendedBumpOptsUndefined: Self = StObject.set(x, "recommendedBumpOpts", js.undefined)
          
          @scala.inline
          def setWriterOpts(value: WriterOptions[TCommit, TContext]): Self = StObject.set(x, "writerOpts", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setWriterOptsUndefined: Self = StObject.set(x, "writerOpts", js.undefined)
        }
      }
    }
    // tslint:disable-next-line max-line-length
    type Config[TCommit /* <: Commit[String | Double | js.Symbol] */, TContext /* <: typingsSlinky.conventionalChangelogWriter.mod.Context */] = js.Promise[js.Object] | js.Function | js.Object
    
    type Logger = js.Function1[/* message */ js.UndefOr[js.Any], Unit]
    
    @scala.inline
    implicit class OptionsMutableBuilder[Self <: Options[_, _], TCommit /* <: Commit[String | Double | js.Symbol] */, TContext /* <: typingsSlinky.conventionalChangelogWriter.mod.Context */] (val x: Self with (Options[TCommit, TContext])) extends AnyVal {
      
      @scala.inline
      def setAppend(value: Boolean): Self = StObject.set(x, "append", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAppendUndefined: Self = StObject.set(x, "append", js.undefined)
      
      @scala.inline
      def setConfig(value: Config[TCommit, TContext]): Self = StObject.set(x, "config", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setConfigUndefined: Self = StObject.set(x, "config", js.undefined)
      
      @scala.inline
      def setDebug(value: /* message */ js.UndefOr[js.Any] => Unit): Self = StObject.set(x, "debug", js.Any.fromFunction1(value))
      
      @scala.inline
      def setDebugUndefined: Self = StObject.set(x, "debug", js.undefined)
      
      @scala.inline
      def setLernaPackage(value: String): Self = StObject.set(x, "lernaPackage", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLernaPackageNull: Self = StObject.set(x, "lernaPackage", null)
      
      @scala.inline
      def setLernaPackageUndefined: Self = StObject.set(x, "lernaPackage", js.undefined)
      
      @scala.inline
      def setOutputUnreleased(value: Boolean): Self = StObject.set(x, "outputUnreleased", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOutputUnreleasedUndefined: Self = StObject.set(x, "outputUnreleased", js.undefined)
      
      @scala.inline
      def setPkg(value: Pkg): Self = StObject.set(x, "pkg", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPkgUndefined: Self = StObject.set(x, "pkg", js.undefined)
      
      @scala.inline
      def setReleaseCount(value: Double): Self = StObject.set(x, "releaseCount", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReleaseCountUndefined: Self = StObject.set(x, "releaseCount", js.undefined)
      
      @scala.inline
      def setTagPrefix(value: String): Self = StObject.set(x, "tagPrefix", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTagPrefixUndefined: Self = StObject.set(x, "tagPrefix", js.undefined)
      
      @scala.inline
      def setTransform(value: Transform[TCommit]): Self = StObject.set(x, "transform", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTransformUndefined: Self = StObject.set(x, "transform", js.undefined)
      
      @scala.inline
      def setWarn(value: /* message */ js.UndefOr[js.Any] => Unit): Self = StObject.set(x, "warn", js.Any.fromFunction1(value))
      
      @scala.inline
      def setWarnUndefined: Self = StObject.set(x, "warn", js.undefined)
    }
    
    @js.native
    trait Pkg extends StObject {
      
      /**
        * The location of your "package.json".
        */
      var path: js.UndefOr[String] = js.native
      
      /**
        * A function that takes `package.json` data as the argument and returns the
        * modified data. Note this is performed before normalizing package.json data.
        * Useful when you need to add a leading 'v' to your version or modify your
        * repository url, etc.
        *
        * @defaults
        * Pass through.
        */
      var transform: js.UndefOr[js.Function1[/* pkg */ Record[String, _], Record[String, _]]] = js.native
    }
    object Pkg {
      
      @scala.inline
      def apply(): Pkg = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[Pkg]
      }
      
      @scala.inline
      implicit class PkgMutableBuilder[Self <: Pkg] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
        
        @scala.inline
        def setTransform(value: /* pkg */ Record[String, _] => Record[String, _]): Self = StObject.set(x, "transform", js.Any.fromFunction1(value))
        
        @scala.inline
        def setTransformUndefined: Self = StObject.set(x, "transform", js.undefined)
      }
    }
    
    object Transform {
      
      type Callback[T /* <: Commit[String | Double | js.Symbol] */] = js.Function2[/* error */ js.Any, /* commit */ T, Unit]
    }
    type Transform[T /* <: Commit[String | Double | js.Symbol] */] = js.ThisFunction2[
        /* this */ typingsSlinky.node.streamMod.Transform, 
        /* commit */ Commit[String | Double | js.Symbol], 
        /* cb */ typingsSlinky.conventionalChangelogCore.mod.Options.Transform.Callback[T], 
        Unit
      ]
  }
  
  @js.native
  trait ParserOptions
    extends typingsSlinky.conventionalCommitsParser.mod.Options
  object ParserOptions {
    
    @scala.inline
    def apply(): ParserOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ParserOptions]
    }
  }
  
  @js.native
  trait WriterOptions[TCommit /* <: Commit[String | Double | js.Symbol] */, TContext /* <: typingsSlinky.conventionalChangelogWriter.mod.Context */]
    extends typingsSlinky.conventionalChangelogWriter.mod.Options[TCommit, MergedContext[TContext]]
  object WriterOptions {
    
    @scala.inline
    def apply[TCommit /* <: Commit[String | Double | js.Symbol] */, TContext /* <: typingsSlinky.conventionalChangelogWriter.mod.Context */](): WriterOptions[TCommit, TContext] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[WriterOptions[TCommit, TContext]]
    }
  }
}
