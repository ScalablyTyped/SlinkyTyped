package typingsSlinky.gulpHelp

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.gulp.mod.DestMethod
import typingsSlinky.gulp.mod.Gulp
import typingsSlinky.gulp.mod.SrcMethod
import typingsSlinky.gulp.mod.TaskCallback
import typingsSlinky.gulp.mod.WatchMethod
import typingsSlinky.orchestrator.mod.^
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("gulp-help", JSImport.Namespace)
  @js.native
  def apply(gulp: Gulp): GulpHelp = js.native
  @JSImport("gulp-help", JSImport.Namespace)
  @js.native
  def apply(gulp: Gulp, options: GulpHelpOptions): GulpHelp = js.native
  
  @js.native
  trait GulpHelp extends ^ {
    
    var dest: DestMethod = js.native
    
    var src: SrcMethod = js.native
    
    var task: TaskMethod = js.native
    
    var watch: WatchMethod = js.native
  }
  
  @js.native
  trait GulpHelpOptions extends StObject {
    
    /**
      * A function to run after the default help task runs
      */
    var afterPrintCallback: js.UndefOr[js.Function] = js.native
    
    /**
      * Adds aliases to the default help task
      */
    var aliases: js.UndefOr[js.Array[String]] = js.native
    
    /**
      * Modifies the default help message
      */
    var description: js.UndefOr[String] = js.native
    
    /**
      * Hide all task dependencies
      */
    var hideDepsMessage: js.UndefOr[Boolean] = js.native
    
    /**
      * Hide all tasks with no help message defined. Useful when including 3rd party tasks
      */
    var hideEmpty: js.UndefOr[Boolean] = js.native
  }
  object GulpHelpOptions {
    
    @scala.inline
    def apply(): GulpHelpOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[GulpHelpOptions]
    }
    
    @scala.inline
    implicit class GulpHelpOptionsMutableBuilder[Self <: GulpHelpOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAfterPrintCallback(value: js.Function): Self = StObject.set(x, "afterPrintCallback", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAfterPrintCallbackUndefined: Self = StObject.set(x, "afterPrintCallback", js.undefined)
      
      @scala.inline
      def setAliases(value: js.Array[String]): Self = StObject.set(x, "aliases", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAliasesUndefined: Self = StObject.set(x, "aliases", js.undefined)
      
      @scala.inline
      def setAliasesVarargs(value: String*): Self = StObject.set(x, "aliases", js.Array(value :_*))
      
      @scala.inline
      def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
      
      @scala.inline
      def setHideDepsMessage(value: Boolean): Self = StObject.set(x, "hideDepsMessage", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHideDepsMessageUndefined: Self = StObject.set(x, "hideDepsMessage", js.undefined)
      
      @scala.inline
      def setHideEmpty(value: Boolean): Self = StObject.set(x, "hideEmpty", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHideEmptyUndefined: Self = StObject.set(x, "hideEmpty", js.undefined)
    }
  }
  
  type HelpOption = String | Boolean
  
  @js.native
  trait TaskMethod extends StObject {
    
    /**
      * Define a task.
      *
      * @param name the name of the task. Tasks that you want to run from the command line should not have spaces in them.
      * @param fn the function that performs the task's operations. Generally this takes the form of gulp.src().pipe(someplugin()).
      * @param option task options
      */
    def apply(name: String): js.Any = js.native
    /**
      * Define a task.
      *
      * @param name the name of the task. Tasks that you want to run from the command line should not have spaces in them.
      * @param deps an array of tasks to be executed and completed before your task will run.
      * @param fn the function that performs the task's operations. Generally this takes the form of gulp.src().pipe(someplugin()).
      * @param option task options
      */
    def apply(name: String, deps: js.Array[String]): js.Any = js.native
    def apply(name: String, deps: js.Array[String], fn: js.UndefOr[scala.Nothing], option: TaskOptions): js.Any = js.native
    def apply(name: String, deps: js.Array[String], fn: TaskCallback): js.Any = js.native
    def apply(name: String, deps: js.Array[String], fn: TaskCallback, option: TaskOptions): js.Any = js.native
    def apply(name: String, fn: js.UndefOr[scala.Nothing], option: TaskOptions): js.Any = js.native
    def apply(name: String, fn: TaskCallback): js.Any = js.native
    def apply(name: String, fn: TaskCallback, option: TaskOptions): js.Any = js.native
    /**
      * Define a task.
      *
      * @param name the name of the task. Tasks that you want to run from the command line should not have spaces in them.
      * @param help Custom help message as a string. If you want to hide the task from the help menu, supply false
      * @param fn the function that performs the task's operations. Generally this takes the form of gulp.src().pipe(someplugin()).
      * @param option task options
      */
    def apply(name: String, help: HelpOption): js.Any = js.native
    /**
      * Define a task.
      *
      * @param name the name of the task. Tasks that you want to run from the command line should not have spaces in them.
      * @param help Custom help message as a string. If you want to hide the task from the help menu, supply false
      * @param deps an array of tasks to be executed and completed before your task will run.
      * @param fn the function that performs the task's operations. Generally this takes the form of gulp.src().pipe(someplugin()).
      * @param option task options
      */
    def apply(name: String, help: HelpOption, deps: js.Array[String]): js.Any = js.native
    def apply(
      name: String,
      help: HelpOption,
      deps: js.Array[String],
      fn: js.UndefOr[scala.Nothing],
      option: TaskOptions
    ): js.Any = js.native
    def apply(name: String, help: HelpOption, deps: js.Array[String], fn: TaskCallback): js.Any = js.native
    def apply(name: String, help: HelpOption, deps: js.Array[String], fn: TaskCallback, option: TaskOptions): js.Any = js.native
    def apply(name: String, help: HelpOption, fn: js.UndefOr[scala.Nothing], option: TaskOptions): js.Any = js.native
    def apply(name: String, help: HelpOption, fn: TaskCallback): js.Any = js.native
    def apply(name: String, help: HelpOption, fn: TaskCallback, option: TaskOptions): js.Any = js.native
  }
  
  @js.native
  trait TaskOptions extends StObject {
    
    /**
      * List of aliases for this task
      */
    var aliases: js.UndefOr[js.Array[String]] = js.native
    
    /**
      * Object documenting options which can be passed to your task
      */
    var options: js.UndefOr[StringDictionary[String]] = js.native
  }
  object TaskOptions {
    
    @scala.inline
    def apply(): TaskOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TaskOptions]
    }
    
    @scala.inline
    implicit class TaskOptionsMutableBuilder[Self <: TaskOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAliases(value: js.Array[String]): Self = StObject.set(x, "aliases", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAliasesUndefined: Self = StObject.set(x, "aliases", js.undefined)
      
      @scala.inline
      def setAliasesVarargs(value: String*): Self = StObject.set(x, "aliases", js.Array(value :_*))
      
      @scala.inline
      def setOptions(value: StringDictionary[String]): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOptionsUndefined: Self = StObject.set(x, "options", js.undefined)
    }
  }
}
