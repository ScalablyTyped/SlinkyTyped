package typingsSlinky.jupyterlabRendermimeInterfaces.mod.IRenderMime

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The options used to initialize a document widget factory.
  *
  * This interface is intended to be used by mime renderer extensions
  * to define a document opener that uses its renderer factory.
  */
@js.native
trait IDocumentWidgetFactoryOptions extends js.Object {
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
  val toolbarFactory: js.UndefOr[js.Function1[/* widget */ IRenderer, js.Array[IToolbarItem]]] = js.native
}

object IDocumentWidgetFactoryOptions {
  @scala.inline
  def apply(fileTypes: js.Array[String], name: String, primaryFileType: String): IDocumentWidgetFactoryOptions = {
    val __obj = js.Dynamic.literal(fileTypes = fileTypes.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], primaryFileType = primaryFileType.asInstanceOf[js.Any])
    __obj.asInstanceOf[IDocumentWidgetFactoryOptions]
  }
  @scala.inline
  implicit class IDocumentWidgetFactoryOptionsOps[Self <: IDocumentWidgetFactoryOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFileTypes(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fileTypes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPrimaryFileType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("primaryFileType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDefaultFor(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultFor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDefaultFor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultFor")(js.undefined)
        ret
    }
    @scala.inline
    def withDefaultRendered(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultRendered")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDefaultRendered: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultRendered")(js.undefined)
        ret
    }
    @scala.inline
    def withModelName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("modelName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutModelName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("modelName")(js.undefined)
        ret
    }
    @scala.inline
    def withToolbarFactory(value: /* widget */ IRenderer => js.Array[IToolbarItem]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("toolbarFactory")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutToolbarFactory: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("toolbarFactory")(js.undefined)
        ret
    }
  }
  
}

