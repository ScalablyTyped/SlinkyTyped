package typingsSlinky.datGui

import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.raw.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("dat.gui", "GUI")
  @js.native
  class GUI () extends StObject {
    def this(option: GUIParams) = this()
    
    var __controllers: js.Array[GUIController] = js.native
    
    var __folders: StringDictionary[GUI] = js.native
    
    def add(target: js.Object, propName: String): GUIController = js.native
    def add(target: js.Object, propName: String, items: js.Array[Double | String]): GUIController = js.native
    def add(target: js.Object, propName: String, items: js.Object): GUIController = js.native
    def add(
      target: js.Object,
      propName: String,
      min: js.UndefOr[scala.Nothing],
      max: js.UndefOr[scala.Nothing],
      step: Double
    ): GUIController = js.native
    def add(target: js.Object, propName: String, min: js.UndefOr[scala.Nothing], max: Double): GUIController = js.native
    def add(target: js.Object, propName: String, min: js.UndefOr[scala.Nothing], max: Double, step: Double): GUIController = js.native
    def add(target: js.Object, propName: String, min: Double): GUIController = js.native
    def add(target: js.Object, propName: String, min: Double, max: js.UndefOr[scala.Nothing], step: Double): GUIController = js.native
    def add(target: js.Object, propName: String, min: Double, max: Double): GUIController = js.native
    def add(target: js.Object, propName: String, min: Double, max: Double, step: Double): GUIController = js.native
    def add(target: js.Object, propName: String, status: Boolean): GUIController = js.native
    
    def addColor(target: js.Object, propName: String): GUIController = js.native
    
    def addFolder(propName: String): GUI = js.native
    
    val autoPlace: Boolean = js.native
    
    def close(): Unit = js.native
    
    var closed: Boolean = js.native
    
    def destroy(): Unit = js.native
    
    var domElement: HTMLElement = js.native
    
    def getRoot(): GUI = js.native
    
    def getSaveObject(): js.Object = js.native
    
    def hide(): Unit = js.native
    
    def listen(controller: GUIController): Unit = js.native
    
    val load: js.Object = js.native
    
    var name: String = js.native
    
    def open(): Unit = js.native
    
    // gui properties in dat/gui/GUI.js
    val parent: GUI = js.native
    
    var preset: String = js.native
    
    def remember(target: js.Object, additionalTargets: js.Object*): Unit = js.native
    
    def remove(controller: GUIController): Unit = js.native
    
    def removeFolder(subFolder: GUI): Unit = js.native
    
    def revert(gui: GUI): Unit = js.native
    
    def save(): Unit = js.native
    
    def saveAs(presetName: String): Unit = js.native
    
    val scrollable: Boolean = js.native
    
    def show(): Unit = js.native
    
    def updateDisplay(): Unit = js.native
    
    var useLocalStorage: Boolean = js.native
    
    var width: Double = js.native
  }
  /* static members */
  object GUI {
    
    @JSImport("dat.gui", "GUI")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("dat.gui", "GUI.CLASS_AUTO_PLACE")
    @js.native
    def CLASS_AUTO_PLACE: String = js.native
    @scala.inline
    def CLASS_AUTO_PLACE_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("CLASS_AUTO_PLACE")(x.asInstanceOf[js.Any])
    
    @JSImport("dat.gui", "GUI.CLASS_AUTO_PLACE_CONTAINER")
    @js.native
    def CLASS_AUTO_PLACE_CONTAINER: String = js.native
    @scala.inline
    def CLASS_AUTO_PLACE_CONTAINER_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("CLASS_AUTO_PLACE_CONTAINER")(x.asInstanceOf[js.Any])
    
    @JSImport("dat.gui", "GUI.CLASS_CLOSED")
    @js.native
    def CLASS_CLOSED: String = js.native
    @scala.inline
    def CLASS_CLOSED_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("CLASS_CLOSED")(x.asInstanceOf[js.Any])
    
    @JSImport("dat.gui", "GUI.CLASS_CLOSE_BOTTOM")
    @js.native
    def CLASS_CLOSE_BOTTOM: String = js.native
    @scala.inline
    def CLASS_CLOSE_BOTTOM_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("CLASS_CLOSE_BOTTOM")(x.asInstanceOf[js.Any])
    
    @JSImport("dat.gui", "GUI.CLASS_CLOSE_BUTTON")
    @js.native
    def CLASS_CLOSE_BUTTON: String = js.native
    @scala.inline
    def CLASS_CLOSE_BUTTON_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("CLASS_CLOSE_BUTTON")(x.asInstanceOf[js.Any])
    
    @JSImport("dat.gui", "GUI.CLASS_CLOSE_TOP")
    @js.native
    def CLASS_CLOSE_TOP: String = js.native
    @scala.inline
    def CLASS_CLOSE_TOP_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("CLASS_CLOSE_TOP")(x.asInstanceOf[js.Any])
    
    @JSImport("dat.gui", "GUI.CLASS_CONTROLLER_ROW")
    @js.native
    def CLASS_CONTROLLER_ROW: String = js.native
    @scala.inline
    def CLASS_CONTROLLER_ROW_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("CLASS_CONTROLLER_ROW")(x.asInstanceOf[js.Any])
    
    @JSImport("dat.gui", "GUI.CLASS_DRAG")
    @js.native
    def CLASS_DRAG: String = js.native
    @scala.inline
    def CLASS_DRAG_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("CLASS_DRAG")(x.asInstanceOf[js.Any])
    
    @JSImport("dat.gui", "GUI.CLASS_MAIN")
    @js.native
    def CLASS_MAIN: String = js.native
    @scala.inline
    def CLASS_MAIN_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("CLASS_MAIN")(x.asInstanceOf[js.Any])
    
    @JSImport("dat.gui", "GUI.CLASS_TOO_TALL")
    @js.native
    def CLASS_TOO_TALL: String = js.native
    @scala.inline
    def CLASS_TOO_TALL_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("CLASS_TOO_TALL")(x.asInstanceOf[js.Any])
    
    @JSImport("dat.gui", "GUI.DEFAULT_WIDTH")
    @js.native
    def DEFAULT_WIDTH: Double = js.native
    @scala.inline
    def DEFAULT_WIDTH_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DEFAULT_WIDTH")(x.asInstanceOf[js.Any])
    
    @JSImport("dat.gui", "GUI.TEXT_CLOSED")
    @js.native
    def TEXT_CLOSED: String = js.native
    @scala.inline
    def TEXT_CLOSED_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("TEXT_CLOSED")(x.asInstanceOf[js.Any])
    
    @JSImport("dat.gui", "GUI.TEXT_OPEN")
    @js.native
    def TEXT_OPEN: String = js.native
    @scala.inline
    def TEXT_OPEN_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("TEXT_OPEN")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("dat.gui", "GUIController")
  @js.native
  class GUIController protected () extends StObject {
    def this(`object`: js.Object, property: String) = this()
    
    var domElement: HTMLElement = js.native
    
    // FunctionController
    def fire(): GUIController = js.native
    
    def getValue(): js.Any = js.native
    
    def isModified(): Boolean = js.native
    
    def listen(): GUIController = js.native
    
    def max(n: Double): GUIController = js.native
    
    // NumberController
    def min(n: Double): GUIController = js.native
    
    def name(name: String): GUIController = js.native
    
    var `object`: js.Object = js.native
    
    def onChange(fnc: js.Function1[/* value */ js.UndefOr[js.Any], Unit]): GUIController = js.native
    
    def onFinishChange(fnc: js.Function1[/* value */ js.UndefOr[js.Any], Unit]): GUIController = js.native
    
    def options(option: js.Any): GUIController = js.native
    
    var property: String = js.native
    
    def remove(): GUIController = js.native
    
    def setValue(value: js.Any): GUIController = js.native
    
    def step(n: Double): GUIController = js.native
    
    def updateDisplay(): GUIController = js.native
  }
  
  @js.native
  trait GUIParams extends StObject {
    
    /**
      * Handles GUI's element placement for you.
      * @default true
      */
    var autoPlace: js.UndefOr[Boolean] = js.native
    
    /**
      * If true, close/open button shows on top of the GUI.
      * @default false
      */
    var closeOnTop: js.UndefOr[Boolean] = js.native
    
    /**
      * If true, starts closed.
      * @default false
      */
    var closed: js.UndefOr[Boolean] = js.native
    
    /**
      * If true, GUI is closed by the "h" keypress.
      * @default false
      */
    var hideable: js.UndefOr[Boolean] = js.native
    
    /**
      * JSON object representing the saved state of this GUI.
      */
    var load: js.UndefOr[js.Any] = js.native
    
    /**
      * The name of this GUI.
      */
    var name: js.UndefOr[String] = js.native
    
    /**
      * The identifier for a set of saved values.
      */
    var preset: js.UndefOr[String] = js.native
    
    /**
      * The width of GUI element.
      */
    var width: js.UndefOr[Double] = js.native
  }
  object GUIParams {
    
    @scala.inline
    def apply(): GUIParams = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[GUIParams]
    }
    
    @scala.inline
    implicit class GUIParamsMutableBuilder[Self <: GUIParams] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAutoPlace(value: Boolean): Self = StObject.set(x, "autoPlace", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAutoPlaceUndefined: Self = StObject.set(x, "autoPlace", js.undefined)
      
      @scala.inline
      def setCloseOnTop(value: Boolean): Self = StObject.set(x, "closeOnTop", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCloseOnTopUndefined: Self = StObject.set(x, "closeOnTop", js.undefined)
      
      @scala.inline
      def setClosed(value: Boolean): Self = StObject.set(x, "closed", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClosedUndefined: Self = StObject.set(x, "closed", js.undefined)
      
      @scala.inline
      def setHideable(value: Boolean): Self = StObject.set(x, "hideable", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHideableUndefined: Self = StObject.set(x, "hideable", js.undefined)
      
      @scala.inline
      def setLoad(value: js.Any): Self = StObject.set(x, "load", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLoadUndefined: Self = StObject.set(x, "load", js.undefined)
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      @scala.inline
      def setPreset(value: String): Self = StObject.set(x, "preset", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPresetUndefined: Self = StObject.set(x, "preset", js.undefined)
      
      @scala.inline
      def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    }
  }
}
