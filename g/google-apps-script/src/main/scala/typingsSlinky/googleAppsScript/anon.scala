package typingsSlinky.googleAppsScript

import typingsSlinky.googleAppsScript.GoogleAppsScript.Integer
import typingsSlinky.googleAppsScript.GoogleAppsScript.Spreadsheet.Sheet
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait CommentsOnly extends StObject {
    
    var commentsOnly: js.UndefOr[Boolean] = js.native
    
    var contentsOnly: js.UndefOr[Boolean] = js.native
    
    var formatOnly: js.UndefOr[Boolean] = js.native
    
    var skipFilteredRows: js.UndefOr[Boolean] = js.native
    
    var validationsOnly: js.UndefOr[Boolean] = js.native
  }
  object CommentsOnly {
    
    @scala.inline
    def apply(): CommentsOnly = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CommentsOnly]
    }
    
    @scala.inline
    implicit class CommentsOnlyMutableBuilder[Self <: CommentsOnly] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCommentsOnly(value: Boolean): Self = StObject.set(x, "commentsOnly", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCommentsOnlyUndefined: Self = StObject.set(x, "commentsOnly", js.undefined)
      
      @scala.inline
      def setContentsOnly(value: Boolean): Self = StObject.set(x, "contentsOnly", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContentsOnlyUndefined: Self = StObject.set(x, "contentsOnly", js.undefined)
      
      @scala.inline
      def setFormatOnly(value: Boolean): Self = StObject.set(x, "formatOnly", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFormatOnlyUndefined: Self = StObject.set(x, "formatOnly", js.undefined)
      
      @scala.inline
      def setSkipFilteredRows(value: Boolean): Self = StObject.set(x, "skipFilteredRows", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSkipFilteredRowsUndefined: Self = StObject.set(x, "skipFilteredRows", js.undefined)
      
      @scala.inline
      def setValidationsOnly(value: Boolean): Self = StObject.set(x, "validationsOnly", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValidationsOnlyUndefined: Self = StObject.set(x, "validationsOnly", js.undefined)
    }
  }
  
  @js.native
  trait ContentsOnly extends StObject {
    
    var contentsOnly: js.UndefOr[Boolean] = js.native
    
    var formatOnly: js.UndefOr[Boolean] = js.native
  }
  object ContentsOnly {
    
    @scala.inline
    def apply(): ContentsOnly = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ContentsOnly]
    }
    
    @scala.inline
    implicit class ContentsOnlyMutableBuilder[Self <: ContentsOnly] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setContentsOnly(value: Boolean): Self = StObject.set(x, "contentsOnly", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContentsOnlyUndefined: Self = StObject.set(x, "contentsOnly", js.undefined)
      
      @scala.inline
      def setFormatOnly(value: Boolean): Self = StObject.set(x, "formatOnly", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFormatOnlyUndefined: Self = StObject.set(x, "formatOnly", js.undefined)
    }
  }
  
  @js.native
  trait FunctionName extends StObject {
    
    var functionName: String = js.native
    
    var name: String = js.native
  }
  object FunctionName {
    
    @scala.inline
    def apply(functionName: String, name: String): FunctionName = {
      val __obj = js.Dynamic.literal(functionName = functionName.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[FunctionName]
    }
    
    @scala.inline
    implicit class FunctionNameMutableBuilder[Self <: FunctionName] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFunctionName(value: String): Self = StObject.set(x, "functionName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Max extends StObject {
    
    var max: js.UndefOr[Integer] = js.native
    
    var start: js.UndefOr[Integer] = js.native
  }
  object Max {
    
    @scala.inline
    def apply(): Max = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Max]
    }
    
    @scala.inline
    implicit class MaxMutableBuilder[Self <: Max] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setMax(value: Integer): Self = StObject.set(x, "max", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxUndefined: Self = StObject.set(x, "max", js.undefined)
      
      @scala.inline
      def setStart(value: Integer): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStartUndefined: Self = StObject.set(x, "start", js.undefined)
    }
  }
  
  @js.native
  trait Name extends StObject {
    
    var name: String = js.native
  }
  object Name {
    
    @scala.inline
    def apply(name: String): Name = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[Name]
    }
    
    @scala.inline
    implicit class NameMutableBuilder[Self <: Name] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Template extends StObject {
    
    var template: js.UndefOr[Sheet] = js.native
  }
  object Template {
    
    @scala.inline
    def apply(): Template = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Template]
    }
    
    @scala.inline
    implicit class TemplateMutableBuilder[Self <: Template] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setTemplate(value: Sheet): Self = StObject.set(x, "template", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTemplateUndefined: Self = StObject.set(x, "template", js.undefined)
    }
  }
}
