package typingsSlinky.babylonjs.BABYLON

import org.scalajs.dom.raw.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IInspectorOptions extends js.Object {
  /**
    * Display in embed mode (both panes on the right)
    */
  var embedMode: js.UndefOr[Boolean] = js.native
  /**
    * Allow the panes to be closed by users (default: true)
    */
  var enableClose: js.UndefOr[Boolean] = js.native
  /**
    * Allow the panes to popup (default: true)
    */
  var enablePopup: js.UndefOr[Boolean] = js.native
  /**
    * Optional list of extensibility entries
    */
  var explorerExtensibility: js.UndefOr[js.Array[IExplorerExtensibilityGroup]] = js.native
  /**
    * HTML element to use as root (the parent of the rendering canvas will be used as default value)
    */
  var globalRoot: js.UndefOr[HTMLElement] = js.native
  /**
    * let the Inspector handles resize of the canvas when panes are resized (default to true)
    */
  var handleResize: js.UndefOr[Boolean] = js.native
  /**
    * Optional initial tab (default to DebugLayerTab.Properties)
    */
  var initialTab: js.UndefOr[DebugLayerTab] = js.native
  /**
    * Optional URL to get the inspector script from (by default it uses the babylonjs CDN).
    */
  var inspectorURL: js.UndefOr[String] = js.native
  /**
    * Display in overlay mode (default: false)
    */
  var overlay: js.UndefOr[Boolean] = js.native
  /**
    * Display the Scene explorer
    */
  var showExplorer: js.UndefOr[Boolean] = js.native
  /**
    * Display the property inspector
    */
  var showInspector: js.UndefOr[Boolean] = js.native
}

object IInspectorOptions {
  @scala.inline
  def apply(): IInspectorOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IInspectorOptions]
  }
  @scala.inline
  implicit class IInspectorOptionsOps[Self <: IInspectorOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEmbedMode(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("embedMode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEmbedMode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("embedMode")(js.undefined)
        ret
    }
    @scala.inline
    def withEnableClose(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableClose")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnableClose: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableClose")(js.undefined)
        ret
    }
    @scala.inline
    def withEnablePopup(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enablePopup")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnablePopup: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enablePopup")(js.undefined)
        ret
    }
    @scala.inline
    def withExplorerExtensibility(value: js.Array[IExplorerExtensibilityGroup]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("explorerExtensibility")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExplorerExtensibility: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("explorerExtensibility")(js.undefined)
        ret
    }
    @scala.inline
    def withGlobalRoot(value: HTMLElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("globalRoot")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGlobalRoot: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("globalRoot")(js.undefined)
        ret
    }
    @scala.inline
    def withHandleResize(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("handleResize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHandleResize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("handleResize")(js.undefined)
        ret
    }
    @scala.inline
    def withInitialTab(value: DebugLayerTab): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("initialTab")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInitialTab: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("initialTab")(js.undefined)
        ret
    }
    @scala.inline
    def withInspectorURL(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inspectorURL")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInspectorURL: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inspectorURL")(js.undefined)
        ret
    }
    @scala.inline
    def withOverlay(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("overlay")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOverlay: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("overlay")(js.undefined)
        ret
    }
    @scala.inline
    def withShowExplorer(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showExplorer")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShowExplorer: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showExplorer")(js.undefined)
        ret
    }
    @scala.inline
    def withShowInspector(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showInspector")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShowInspector: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showInspector")(js.undefined)
        ret
    }
  }
  
}

