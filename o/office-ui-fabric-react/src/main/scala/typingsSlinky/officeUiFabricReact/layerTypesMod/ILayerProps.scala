package typingsSlinky.officeUiFabricReact.layerTypesMod

import org.scalajs.dom.raw.HTMLDivElement
import slinky.core.facade.ReactRef
import typingsSlinky.officeUiFabricReact.layerBaseMod.LayerBase
import typingsSlinky.react.mod.HTMLAttributes
import typingsSlinky.std.Partial
import typingsSlinky.uifabricMergeStyles.istylefunctionMod.IStyleFunctionOrObject
import typingsSlinky.uifabricStyling.ithemeMod.ITheme
import typingsSlinky.uifabricUtilities.createRefMod.IRefObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ILayerProps extends HTMLAttributes[HTMLDivElement | LayerBase] {
  /**
    * Optional callback to access the ILayer interface. Use this instead of ref for accessing
    * the public methods and properties of the component.
    */
  var componentRef: js.UndefOr[IRefObject[ILayer]] = js.native
  /**
    * When enabled, Layer allows events to bubble up from Layer content.
    * Traditionally Layer has not had this behavior. This prop preserves backwards compatibility by
    * default while allowing users to opt in to the new event bubbling functionality.
    */
  var eventBubblingEnabled: js.UndefOr[Boolean] = js.native
  /**
    * The optional id property provided on a LayerHost that this Layer should render within. The LayerHost does
    * not need to be immediately available but once has been rendered, and if missing, we'll avoid trying
    * to render the Layer content until the host is available. If an id is not provided, we will render the Layer
    * content in a fixed position element rendered at the end of the document.
    */
  var hostId: js.UndefOr[String] = js.native
  /**
    * Whether the layer should be added as the first child of the host.
    * If true, the layer will be inserted as the first child of the host
    * By default, the layer will be appended at the end to the host
    */
  var insertFirst: js.UndefOr[Boolean] = js.native
  /**
    * Callback for when the layer is mounted.
    */
  var onLayerDidMount: js.UndefOr[js.Function0[Unit]] = js.native
  /**
    * Callback for when the layer is mounted.
    * @deprecated Use onLayerDidMount.
    */
  var onLayerMounted: js.UndefOr[js.Function0[Unit]] = js.native
  /**
    * Callback for when the layer is unmounted.
    */
  var onLayerWillUnmount: js.UndefOr[js.Function0[Unit]] = js.native
  /**
    * Call to provide customized styling that will layer on top of the variant rules
    */
  var styles: js.UndefOr[IStyleFunctionOrObject[ILayerStyleProps, ILayerStyles]] = js.native
  /**
    * Theme provided by HOC.
    */
  var theme: js.UndefOr[ITheme] = js.native
}

object ILayerProps {
  @scala.inline
  def apply(): ILayerProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ILayerProps]
  }
  @scala.inline
  implicit class ILayerPropsOps[Self <: ILayerProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withComponentRefFunction1(value: /* ref */ ILayer | Null => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("componentRef")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withComponentRefRefObject(value: ReactRef[ILayer]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("componentRef")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withComponentRef(value: IRefObject[ILayer]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("componentRef")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutComponentRef: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("componentRef")(js.undefined)
        ret
    }
    @scala.inline
    def withEventBubblingEnabled(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("eventBubblingEnabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEventBubblingEnabled: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("eventBubblingEnabled")(js.undefined)
        ret
    }
    @scala.inline
    def withHostId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hostId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHostId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hostId")(js.undefined)
        ret
    }
    @scala.inline
    def withInsertFirst(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("insertFirst")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInsertFirst: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("insertFirst")(js.undefined)
        ret
    }
    @scala.inline
    def withOnLayerDidMount(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onLayerDidMount")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutOnLayerDidMount: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onLayerDidMount")(js.undefined)
        ret
    }
    @scala.inline
    def withOnLayerMounted(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onLayerMounted")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutOnLayerMounted: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onLayerMounted")(js.undefined)
        ret
    }
    @scala.inline
    def withOnLayerWillUnmount(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onLayerWillUnmount")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutOnLayerWillUnmount: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onLayerWillUnmount")(js.undefined)
        ret
    }
    @scala.inline
    def withStylesFunction1(value: ILayerStyleProps => Partial[ILayerStyles]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("styles")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withStyles(value: IStyleFunctionOrObject[ILayerStyleProps, ILayerStyles]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("styles")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStyles: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("styles")(js.undefined)
        ret
    }
    @scala.inline
    def withTheme(value: ITheme): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("theme")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTheme: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("theme")(js.undefined)
        ret
    }
  }
  
}

