package typingsSlinky.ckeditor.CKEDITOR.plugins

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.ckeditor.CKEDITOR.commandDefinition
import typingsSlinky.ckeditor.CKEDITOR.dom.element
import typingsSlinky.ckeditor.CKEDITOR.dom.elementPath
import typingsSlinky.ckeditor.CKEDITOR.editor
import typingsSlinky.ckeditor.anon.Exec
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object indent {
  
  @js.native
  trait genericDefinition extends commandDefinition {
    
    @JSName("async")
    var async_genericDefinition: Boolean = js.native
    
    @JSName("canUndo")
    var canUndo_genericDefinition: Boolean = js.native
    
    @JSName("contextSensitive")
    var contextSensitive_genericDefinition: Boolean = js.native
    
    @JSName("context")
    var context_genericDefinition: Boolean = js.native
    
    @JSName("editorFocus")
    var editorFocus_genericDefinition: Boolean = js.native
    
    @JSName("fakeKeystroke")
    var fakeKeystroke_genericDefinition: Double = js.native
    
    val isIndent: Boolean = js.native
    
    @JSName("modes")
    var modes_genericDefinition: StringDictionary[js.Any] = js.native
    
    @JSName("readOnly")
    var readOnly_genericDefinition: Boolean = js.native
    
    @JSName("startDisabled")
    var startDisabled_genericDefinition: Boolean = js.native
  }
  
  @js.native
  trait specificDefinition extends StObject {
    
    var database: StringDictionary[js.Any] = js.native
    
    val enterBr: Boolean = js.native
    
    def execJob(editor: editor, priority: Double): Boolean = js.native
    
    def getContext(node: elementPath): element = js.native
    
    val indentKey: StringDictionary[js.Any] = js.native
    
    val isIndent: Boolean = js.native
    
    val jobs: StringDictionary[Exec] = js.native
    
    def refreshJob(editor: editor, priority: Double): Double = js.native
    
    val relatedGlobal: StringDictionary[js.Any] = js.native
  }
  object specificDefinition {
    
    @scala.inline
    def apply(
      database: StringDictionary[js.Any],
      enterBr: Boolean,
      execJob: (editor, Double) => Boolean,
      getContext: elementPath => element,
      indentKey: StringDictionary[js.Any],
      isIndent: Boolean,
      jobs: StringDictionary[Exec],
      refreshJob: (editor, Double) => Double,
      relatedGlobal: StringDictionary[js.Any]
    ): specificDefinition = {
      val __obj = js.Dynamic.literal(database = database.asInstanceOf[js.Any], enterBr = enterBr.asInstanceOf[js.Any], execJob = js.Any.fromFunction2(execJob), getContext = js.Any.fromFunction1(getContext), indentKey = indentKey.asInstanceOf[js.Any], isIndent = isIndent.asInstanceOf[js.Any], jobs = jobs.asInstanceOf[js.Any], refreshJob = js.Any.fromFunction2(refreshJob), relatedGlobal = relatedGlobal.asInstanceOf[js.Any])
      __obj.asInstanceOf[specificDefinition]
    }
    
    @scala.inline
    implicit class specificDefinitionMutableBuilder[Self <: specificDefinition] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDatabase(value: StringDictionary[js.Any]): Self = StObject.set(x, "database", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEnterBr(value: Boolean): Self = StObject.set(x, "enterBr", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExecJob(value: (editor, Double) => Boolean): Self = StObject.set(x, "execJob", js.Any.fromFunction2(value))
      
      @scala.inline
      def setGetContext(value: elementPath => element): Self = StObject.set(x, "getContext", js.Any.fromFunction1(value))
      
      @scala.inline
      def setIndentKey(value: StringDictionary[js.Any]): Self = StObject.set(x, "indentKey", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsIndent(value: Boolean): Self = StObject.set(x, "isIndent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setJobs(value: StringDictionary[Exec]): Self = StObject.set(x, "jobs", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRefreshJob(value: (editor, Double) => Double): Self = StObject.set(x, "refreshJob", js.Any.fromFunction2(value))
      
      @scala.inline
      def setRelatedGlobal(value: StringDictionary[js.Any]): Self = StObject.set(x, "relatedGlobal", value.asInstanceOf[js.Any])
    }
  }
}
