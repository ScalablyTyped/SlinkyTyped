package typingsSlinky.jupyterlabRendermimeInterfaces.mod.IRenderMime

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The options used to initialize a document widget factory.
  *
  * This interface is intended to be used by mime renderer extensions
  * to define a document opener that uses its renderer factory.
  */
@js.native
trait IDocumentWidgetFactoryOptions extends StObject {
  
  /**
    * The file types for which the factory should be the default.
    */
  val defaultFor: js.UndefOr[js.Array[String]] = js.native
  
  /**
    * The file types for which the factory should be the default for rendering,
    * if that is different than the default factory (which may be for editing)
    * If undefined, then it will fall back on the default file type.
    */
  val defaultRendered: js.UndefOr[js.Array[String]] = js.native
  
  /**
    * The file types the widget can view.
    */
  val fileTypes: js.Array[String] = js.native
  
  /**
    * The name of the document model type.
    */
  val modelName: js.UndefOr[String] = js.native
  
  /**
    * The name of the widget to display in dialogs.
    */
  val name: String = js.native
  
  /**
    * The primary file type of the widget.
    */
  val primaryFileType: String = js.native
  
  /**
    * A function returning a list of toolbar items to add to the toolbar.
    */
  val toolbarFactory: js.UndefOr[js.Function1[/* widget */ js.UndefOr[IRenderer], js.Array[IToolbarItem]]] = js.native
}
object IDocumentWidgetFactoryOptions {
  
  @scala.inline
  def apply(fileTypes: js.Array[String], name: String, primaryFileType: String): IDocumentWidgetFactoryOptions = {
    val __obj = js.Dynamic.literal(fileTypes = fileTypes.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], primaryFileType = primaryFileType.asInstanceOf[js.Any])
    __obj.asInstanceOf[IDocumentWidgetFactoryOptions]
  }
  
  @scala.inline
  implicit class IDocumentWidgetFactoryOptionsMutableBuilder[Self <: IDocumentWidgetFactoryOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDefaultFor(value: js.Array[String]): Self = StObject.set(x, "defaultFor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefaultForUndefined: Self = StObject.set(x, "defaultFor", js.undefined)
    
    @scala.inline
    def setDefaultForVarargs(value: String*): Self = StObject.set(x, "defaultFor", js.Array(value :_*))
    
    @scala.inline
    def setDefaultRendered(value: js.Array[String]): Self = StObject.set(x, "defaultRendered", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefaultRenderedUndefined: Self = StObject.set(x, "defaultRendered", js.undefined)
    
    @scala.inline
    def setDefaultRenderedVarargs(value: String*): Self = StObject.set(x, "defaultRendered", js.Array(value :_*))
    
    @scala.inline
    def setFileTypes(value: js.Array[String]): Self = StObject.set(x, "fileTypes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFileTypesVarargs(value: String*): Self = StObject.set(x, "fileTypes", js.Array(value :_*))
    
    @scala.inline
    def setModelName(value: String): Self = StObject.set(x, "modelName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setModelNameUndefined: Self = StObject.set(x, "modelName", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrimaryFileType(value: String): Self = StObject.set(x, "primaryFileType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setToolbarFactory(value: /* widget */ js.UndefOr[IRenderer] => js.Array[IToolbarItem]): Self = StObject.set(x, "toolbarFactory", js.Any.fromFunction1(value))
    
    @scala.inline
    def setToolbarFactoryUndefined: Self = StObject.set(x, "toolbarFactory", js.undefined)
  }
}
