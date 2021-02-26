package typingsSlinky.jupyterlabNbformat

import typingsSlinky.jupyterlabNbformat.jupyterlabNbformatStrings.auto
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  /* Inlined std.Partial<@jupyterlab/nbformat.@jupyterlab/nbformat.IBaseCellJupyterMetadata> */
  @js.native
  trait PartialIBaseCellJupyterMe extends StObject {
    
    var source_hidden: js.UndefOr[Boolean] = js.native
  }
  object PartialIBaseCellJupyterMe {
    
    @scala.inline
    def apply(): PartialIBaseCellJupyterMe = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PartialIBaseCellJupyterMe]
    }
    
    @scala.inline
    implicit class PartialIBaseCellJupyterMeMutableBuilder[Self <: PartialIBaseCellJupyterMe] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setSource_hidden(value: Boolean): Self = StObject.set(x, "source_hidden", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSource_hiddenUndefined: Self = StObject.set(x, "source_hidden", js.undefined)
    }
  }
  
  /* Inlined std.Partial<@jupyterlab/nbformat.@jupyterlab/nbformat.ICodeCellJupyterMetadata> */
  @js.native
  trait PartialICodeCellJupyterMe extends StObject {
    
    var outputs_hidden: js.UndefOr[Boolean] = js.native
    
    var source_hidden: js.UndefOr[Boolean] = js.native
  }
  object PartialICodeCellJupyterMe {
    
    @scala.inline
    def apply(): PartialICodeCellJupyterMe = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PartialICodeCellJupyterMe]
    }
    
    @scala.inline
    implicit class PartialICodeCellJupyterMeMutableBuilder[Self <: PartialICodeCellJupyterMe] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setOutputs_hidden(value: Boolean): Self = StObject.set(x, "outputs_hidden", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOutputs_hiddenUndefined: Self = StObject.set(x, "outputs_hidden", js.undefined)
      
      @scala.inline
      def setSource_hidden(value: Boolean): Self = StObject.set(x, "source_hidden", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSource_hiddenUndefined: Self = StObject.set(x, "source_hidden", js.undefined)
    }
  }
  
  /* Inlined std.Partial<@jupyterlab/nbformat.@jupyterlab/nbformat.ICodeCellMetadata> */
  @js.native
  trait PartialICodeCellMetadata extends StObject {
    
    var collapsed: js.UndefOr[Boolean] = js.native
    
    var jupyter: js.UndefOr[PartialICodeCellJupyterMe] = js.native
    
    var name: js.UndefOr[String] = js.native
    
    var scrolled: js.UndefOr[Boolean | auto] = js.native
    
    var tags: js.UndefOr[js.Array[String]] = js.native
    
    var trusted: js.UndefOr[Boolean] = js.native
  }
  object PartialICodeCellMetadata {
    
    @scala.inline
    def apply(): PartialICodeCellMetadata = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PartialICodeCellMetadata]
    }
    
    @scala.inline
    implicit class PartialICodeCellMetadataMutableBuilder[Self <: PartialICodeCellMetadata] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCollapsed(value: Boolean): Self = StObject.set(x, "collapsed", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCollapsedUndefined: Self = StObject.set(x, "collapsed", js.undefined)
      
      @scala.inline
      def setJupyter(value: PartialICodeCellJupyterMe): Self = StObject.set(x, "jupyter", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setJupyterUndefined: Self = StObject.set(x, "jupyter", js.undefined)
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      @scala.inline
      def setScrolled(value: Boolean | auto): Self = StObject.set(x, "scrolled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setScrolledUndefined: Self = StObject.set(x, "scrolled", js.undefined)
      
      @scala.inline
      def setTags(value: js.Array[String]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
      
      @scala.inline
      def setTagsVarargs(value: String*): Self = StObject.set(x, "tags", js.Array(value :_*))
      
      @scala.inline
      def setTrusted(value: Boolean): Self = StObject.set(x, "trusted", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTrustedUndefined: Self = StObject.set(x, "trusted", js.undefined)
    }
  }
  
  /* Inlined std.Partial<@jupyterlab/nbformat.@jupyterlab/nbformat.IRawCellMetadata> */
  @js.native
  trait PartialIRawCellMetadata extends StObject {
    
    var format: js.UndefOr[String] = js.native
    
    var jupyter: js.UndefOr[PartialIBaseCellJupyterMe] = js.native
    
    var name: js.UndefOr[String] = js.native
    
    var tags: js.UndefOr[js.Array[String]] = js.native
    
    var trusted: js.UndefOr[Boolean] = js.native
  }
  object PartialIRawCellMetadata {
    
    @scala.inline
    def apply(): PartialIRawCellMetadata = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PartialIRawCellMetadata]
    }
    
    @scala.inline
    implicit class PartialIRawCellMetadataMutableBuilder[Self <: PartialIRawCellMetadata] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFormat(value: String): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFormatUndefined: Self = StObject.set(x, "format", js.undefined)
      
      @scala.inline
      def setJupyter(value: PartialIBaseCellJupyterMe): Self = StObject.set(x, "jupyter", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setJupyterUndefined: Self = StObject.set(x, "jupyter", js.undefined)
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      @scala.inline
      def setTags(value: js.Array[String]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
      
      @scala.inline
      def setTagsVarargs(value: String*): Self = StObject.set(x, "tags", js.Array(value :_*))
      
      @scala.inline
      def setTrusted(value: Boolean): Self = StObject.set(x, "trusted", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTrustedUndefined: Self = StObject.set(x, "trusted", js.undefined)
    }
  }
}
