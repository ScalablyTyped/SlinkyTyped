package typingsSlinky.jqueryJcrop

import typingsSlinky.jqueryJcrop.JQuery.Jcrop.Api
import typingsSlinky.jqueryJcrop.JQuery.Jcrop.Options
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait JQuery extends StObject {
  
  def Jcrop(): JQuery = js.native
  def Jcrop(options: js.UndefOr[scala.Nothing], callback: js.ThisFunction0[/* this */ Api, Unit]): JQuery = js.native
  def Jcrop(options: Options): JQuery = js.native
  def Jcrop(options: Options, callback: js.ThisFunction0[/* this */ Api, Unit]): JQuery = js.native
}
object JQuery {
  
  object Jcrop {
    
    @js.native
    trait Api extends StObject {
      
      /** Animate selection to new selection, format: [ x,y,x2,y2 ] */
      def animateTo(selection: js.Tuple4[Double, Double, Double, Double]): Unit = js.native
      
      /** Disables Jcrop interactivity */
      def disable(): Unit = js.native
      
      /** Enables Jcrop interactivity */
      def enable(): Unit = js.native
      
      /** Release current selection */
      def release(): Unit = js.native
      
      /** Remove Jcrop entirely */
      def remove(): Unit = js.native
      
      /** Set selection, format: [ x,y,x2,y2 ] */
      def setSelect(selection: js.Tuple4[Double, Double, Double, Double]): Unit = js.native
      
      /** Query current selection values (interface)  */
      def tellScaled(): SelectionInfo = js.native
      
      /** Query current selection values (true size) */
      def tellSelect(): SelectionInfo = js.native
    }
    object Api {
      
      @scala.inline
      def apply(
        animateTo: js.Tuple4[Double, Double, Double, Double] => Unit,
        disable: () => Unit,
        enable: () => Unit,
        release: () => Unit,
        remove: () => Unit,
        setSelect: js.Tuple4[Double, Double, Double, Double] => Unit,
        tellScaled: () => SelectionInfo,
        tellSelect: () => SelectionInfo
      ): Api = {
        val __obj = js.Dynamic.literal(animateTo = js.Any.fromFunction1(animateTo), disable = js.Any.fromFunction0(disable), enable = js.Any.fromFunction0(enable), release = js.Any.fromFunction0(release), remove = js.Any.fromFunction0(remove), setSelect = js.Any.fromFunction1(setSelect), tellScaled = js.Any.fromFunction0(tellScaled), tellSelect = js.Any.fromFunction0(tellSelect))
        __obj.asInstanceOf[Api]
      }
      
      @scala.inline
      implicit class ApiMutableBuilder[Self <: Api] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setAnimateTo(value: js.Tuple4[Double, Double, Double, Double] => Unit): Self = StObject.set(x, "animateTo", js.Any.fromFunction1(value))
        
        @scala.inline
        def setDisable(value: () => Unit): Self = StObject.set(x, "disable", js.Any.fromFunction0(value))
        
        @scala.inline
        def setEnable(value: () => Unit): Self = StObject.set(x, "enable", js.Any.fromFunction0(value))
        
        @scala.inline
        def setRelease(value: () => Unit): Self = StObject.set(x, "release", js.Any.fromFunction0(value))
        
        @scala.inline
        def setRemove(value: () => Unit): Self = StObject.set(x, "remove", js.Any.fromFunction0(value))
        
        @scala.inline
        def setSetSelect(value: js.Tuple4[Double, Double, Double, Double] => Unit): Self = StObject.set(x, "setSelect", js.Any.fromFunction1(value))
        
        @scala.inline
        def setTellScaled(value: () => SelectionInfo): Self = StObject.set(x, "tellScaled", js.Any.fromFunction0(value))
        
        @scala.inline
        def setTellSelect(value: () => SelectionInfo): Self = StObject.set(x, "tellSelect", js.Any.fromFunction0(value))
      }
    }
    
    /* Rewritten from type alias, can be one of: 
      - typingsSlinky.jqueryJcrop.jqueryJcropStrings.n
      - typingsSlinky.jqueryJcrop.jqueryJcropStrings.s
      - typingsSlinky.jqueryJcrop.jqueryJcropStrings.e
      - typingsSlinky.jqueryJcrop.jqueryJcropStrings.w
    */
    trait CardinalDirection extends StObject
    object CardinalDirection {
      
      @scala.inline
      def e: typingsSlinky.jqueryJcrop.jqueryJcropStrings.e = "e".asInstanceOf[typingsSlinky.jqueryJcrop.jqueryJcropStrings.e]
      
      @scala.inline
      def n: typingsSlinky.jqueryJcrop.jqueryJcropStrings.n = "n".asInstanceOf[typingsSlinky.jqueryJcrop.jqueryJcropStrings.n]
      
      @scala.inline
      def s: typingsSlinky.jqueryJcrop.jqueryJcropStrings.s = "s".asInstanceOf[typingsSlinky.jqueryJcrop.jqueryJcropStrings.s]
      
      @scala.inline
      def w: typingsSlinky.jqueryJcrop.jqueryJcropStrings.w = "w".asInstanceOf[typingsSlinky.jqueryJcrop.jqueryJcropStrings.w]
    }
    
    /* Rewritten from type alias, can be one of: 
      - typingsSlinky.jqueryJcrop.jqueryJcropStrings.nw
      - typingsSlinky.jqueryJcrop.jqueryJcropStrings.ne
      - typingsSlinky.jqueryJcrop.jqueryJcropStrings.se
      - typingsSlinky.jqueryJcrop.jqueryJcropStrings.sw
    */
    trait IntermediateDirection extends StObject
    object IntermediateDirection {
      
      @scala.inline
      def ne: typingsSlinky.jqueryJcrop.jqueryJcropStrings.ne = "ne".asInstanceOf[typingsSlinky.jqueryJcrop.jqueryJcropStrings.ne]
      
      @scala.inline
      def nw: typingsSlinky.jqueryJcrop.jqueryJcropStrings.nw = "nw".asInstanceOf[typingsSlinky.jqueryJcrop.jqueryJcropStrings.nw]
      
      @scala.inline
      def se: typingsSlinky.jqueryJcrop.jqueryJcropStrings.se = "se".asInstanceOf[typingsSlinky.jqueryJcrop.jqueryJcropStrings.se]
      
      @scala.inline
      def sw: typingsSlinky.jqueryJcrop.jqueryJcropStrings.sw = "sw".asInstanceOf[typingsSlinky.jqueryJcrop.jqueryJcropStrings.sw]
    }
    
    type JCropEventHandler = js.Function1[/* c */ SelectionInfo, Unit]
    
    @js.native
    trait Options extends StObject {
      
      var addClass: js.UndefOr[String] = js.native
      
      var allowMove: js.UndefOr[Boolean] = js.native
      
      var allowResize: js.UndefOr[Boolean] = js.native
      
      // Basic Settings
      var allowSelect: js.UndefOr[Boolean] = js.native
      
      var animationDelay: js.UndefOr[Double] = js.native
      
      /** Aspect ratio of w/h (e.g. 1 for square)  */
      var aspectRatio: js.UndefOr[Double] = js.native
      
      var baseClass: js.UndefOr[String] = js.native
      
      /** Set color of background container @default 'black' */
      var bgColor: js.UndefOr[String] = js.native
      
      var bgFade: js.UndefOr[Boolean] = js.native
      
      /** Opacity of outer image when cropping; between 0 and 1 @default .6 */
      var bgOpacity: js.UndefOr[Double] = js.native
      
      var borderOpacity: js.UndefOr[Double] = js.native
      
      var boundary: js.UndefOr[Double] = js.native
      
      /** Maximum height of cropping area @default 0 (no limit) */
      var boxHeight: js.UndefOr[Double] = js.native
      
      /** Maximum width of cropping area @default 0 (no limit) */
      var boxWidth: js.UndefOr[Double] = js.native
      
      var createBorders: js.UndefOr[js.Array[CardinalDirection]] = js.native
      
      var createDragbars: js.UndefOr[js.Array[CardinalDirection]] = js.native
      
      var createHandles: js.UndefOr[js.Array[CardinalDirection | IntermediateDirection]] = js.native
      
      var dragEdges: js.UndefOr[Boolean] = js.native
      
      var drawBorders: js.UndefOr[Boolean] = js.native
      
      var fadeTime: js.UndefOr[Double] = js.native
      
      var fixedSupport: js.UndefOr[Boolean] = js.native
      
      var handleOpacity: js.UndefOr[Double] = js.native
      
      var handleSize: js.UndefOr[Double | Null] = js.native
      
      var keySupport: js.UndefOr[Boolean] = js.native
      
      /** Maximum width/height, use 0 for unbounded dimension; [width, height] */
      var maxSize: js.UndefOr[js.Tuple2[Double, Double]] = js.native
      
      var minSelect: js.UndefOr[js.Tuple2[Double, Double]] = js.native
      
      /** Minimum width/height, use 0 for unbounded dimension; [width, height] */
      var minSize: js.UndefOr[js.Tuple2[Double, Double]] = js.native
      
      /** Called when the selection is moving */
      var onChange: js.UndefOr[JCropEventHandler] = js.native
      
      /** Called when double-clicked */
      var onDblClick: js.UndefOr[JCropEventHandler] = js.native
      
      /** Called when the selection is released */
      var onRelease: js.UndefOr[JCropEventHandler] = js.native
      
      /** Called when selection is completed */
      var onSelect: js.UndefOr[JCropEventHandler] = js.native
      
      /** Set an initial selection area; [x, y, x2, y2] */
      var setSelect: js.UndefOr[js.Tuple4[Double, Double, Double, Double]] = js.native
      
      var shade: js.UndefOr[Boolean | Null] = js.native
      
      var swingSpeed: js.UndefOr[Double] = js.native
      
      var touchSupport: js.UndefOr[Boolean | Null] = js.native
      
      var trackDocument: js.UndefOr[Boolean] = js.native
      
      /** Specify the true size of the image */
      var trueSize: js.UndefOr[js.Tuple2[Double, Double]] = js.native
    }
    object Options {
      
      @scala.inline
      def apply(): Options = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[Options]
      }
      
      @scala.inline
      implicit class OptionsMutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setAddClass(value: String): Self = StObject.set(x, "addClass", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setAddClassUndefined: Self = StObject.set(x, "addClass", js.undefined)
        
        @scala.inline
        def setAllowMove(value: Boolean): Self = StObject.set(x, "allowMove", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setAllowMoveUndefined: Self = StObject.set(x, "allowMove", js.undefined)
        
        @scala.inline
        def setAllowResize(value: Boolean): Self = StObject.set(x, "allowResize", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setAllowResizeUndefined: Self = StObject.set(x, "allowResize", js.undefined)
        
        @scala.inline
        def setAllowSelect(value: Boolean): Self = StObject.set(x, "allowSelect", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setAllowSelectUndefined: Self = StObject.set(x, "allowSelect", js.undefined)
        
        @scala.inline
        def setAnimationDelay(value: Double): Self = StObject.set(x, "animationDelay", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setAnimationDelayUndefined: Self = StObject.set(x, "animationDelay", js.undefined)
        
        @scala.inline
        def setAspectRatio(value: Double): Self = StObject.set(x, "aspectRatio", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setAspectRatioUndefined: Self = StObject.set(x, "aspectRatio", js.undefined)
        
        @scala.inline
        def setBaseClass(value: String): Self = StObject.set(x, "baseClass", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setBaseClassUndefined: Self = StObject.set(x, "baseClass", js.undefined)
        
        @scala.inline
        def setBgColor(value: String): Self = StObject.set(x, "bgColor", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setBgColorUndefined: Self = StObject.set(x, "bgColor", js.undefined)
        
        @scala.inline
        def setBgFade(value: Boolean): Self = StObject.set(x, "bgFade", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setBgFadeUndefined: Self = StObject.set(x, "bgFade", js.undefined)
        
        @scala.inline
        def setBgOpacity(value: Double): Self = StObject.set(x, "bgOpacity", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setBgOpacityUndefined: Self = StObject.set(x, "bgOpacity", js.undefined)
        
        @scala.inline
        def setBorderOpacity(value: Double): Self = StObject.set(x, "borderOpacity", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setBorderOpacityUndefined: Self = StObject.set(x, "borderOpacity", js.undefined)
        
        @scala.inline
        def setBoundary(value: Double): Self = StObject.set(x, "boundary", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setBoundaryUndefined: Self = StObject.set(x, "boundary", js.undefined)
        
        @scala.inline
        def setBoxHeight(value: Double): Self = StObject.set(x, "boxHeight", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setBoxHeightUndefined: Self = StObject.set(x, "boxHeight", js.undefined)
        
        @scala.inline
        def setBoxWidth(value: Double): Self = StObject.set(x, "boxWidth", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setBoxWidthUndefined: Self = StObject.set(x, "boxWidth", js.undefined)
        
        @scala.inline
        def setCreateBorders(value: js.Array[CardinalDirection]): Self = StObject.set(x, "createBorders", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setCreateBordersUndefined: Self = StObject.set(x, "createBorders", js.undefined)
        
        @scala.inline
        def setCreateBordersVarargs(value: CardinalDirection*): Self = StObject.set(x, "createBorders", js.Array(value :_*))
        
        @scala.inline
        def setCreateDragbars(value: js.Array[CardinalDirection]): Self = StObject.set(x, "createDragbars", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setCreateDragbarsUndefined: Self = StObject.set(x, "createDragbars", js.undefined)
        
        @scala.inline
        def setCreateDragbarsVarargs(value: CardinalDirection*): Self = StObject.set(x, "createDragbars", js.Array(value :_*))
        
        @scala.inline
        def setCreateHandles(value: js.Array[CardinalDirection | IntermediateDirection]): Self = StObject.set(x, "createHandles", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setCreateHandlesUndefined: Self = StObject.set(x, "createHandles", js.undefined)
        
        @scala.inline
        def setCreateHandlesVarargs(value: (CardinalDirection | IntermediateDirection)*): Self = StObject.set(x, "createHandles", js.Array(value :_*))
        
        @scala.inline
        def setDragEdges(value: Boolean): Self = StObject.set(x, "dragEdges", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setDragEdgesUndefined: Self = StObject.set(x, "dragEdges", js.undefined)
        
        @scala.inline
        def setDrawBorders(value: Boolean): Self = StObject.set(x, "drawBorders", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setDrawBordersUndefined: Self = StObject.set(x, "drawBorders", js.undefined)
        
        @scala.inline
        def setFadeTime(value: Double): Self = StObject.set(x, "fadeTime", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setFadeTimeUndefined: Self = StObject.set(x, "fadeTime", js.undefined)
        
        @scala.inline
        def setFixedSupport(value: Boolean): Self = StObject.set(x, "fixedSupport", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setFixedSupportUndefined: Self = StObject.set(x, "fixedSupport", js.undefined)
        
        @scala.inline
        def setHandleOpacity(value: Double): Self = StObject.set(x, "handleOpacity", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setHandleOpacityUndefined: Self = StObject.set(x, "handleOpacity", js.undefined)
        
        @scala.inline
        def setHandleSize(value: Double): Self = StObject.set(x, "handleSize", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setHandleSizeNull: Self = StObject.set(x, "handleSize", null)
        
        @scala.inline
        def setHandleSizeUndefined: Self = StObject.set(x, "handleSize", js.undefined)
        
        @scala.inline
        def setKeySupport(value: Boolean): Self = StObject.set(x, "keySupport", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setKeySupportUndefined: Self = StObject.set(x, "keySupport", js.undefined)
        
        @scala.inline
        def setMaxSize(value: js.Tuple2[Double, Double]): Self = StObject.set(x, "maxSize", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setMaxSizeUndefined: Self = StObject.set(x, "maxSize", js.undefined)
        
        @scala.inline
        def setMinSelect(value: js.Tuple2[Double, Double]): Self = StObject.set(x, "minSelect", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setMinSelectUndefined: Self = StObject.set(x, "minSelect", js.undefined)
        
        @scala.inline
        def setMinSize(value: js.Tuple2[Double, Double]): Self = StObject.set(x, "minSize", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setMinSizeUndefined: Self = StObject.set(x, "minSize", js.undefined)
        
        @scala.inline
        def setOnChange(value: /* c */ SelectionInfo => Unit): Self = StObject.set(x, "onChange", js.Any.fromFunction1(value))
        
        @scala.inline
        def setOnChangeUndefined: Self = StObject.set(x, "onChange", js.undefined)
        
        @scala.inline
        def setOnDblClick(value: /* c */ SelectionInfo => Unit): Self = StObject.set(x, "onDblClick", js.Any.fromFunction1(value))
        
        @scala.inline
        def setOnDblClickUndefined: Self = StObject.set(x, "onDblClick", js.undefined)
        
        @scala.inline
        def setOnRelease(value: /* c */ SelectionInfo => Unit): Self = StObject.set(x, "onRelease", js.Any.fromFunction1(value))
        
        @scala.inline
        def setOnReleaseUndefined: Self = StObject.set(x, "onRelease", js.undefined)
        
        @scala.inline
        def setOnSelect(value: /* c */ SelectionInfo => Unit): Self = StObject.set(x, "onSelect", js.Any.fromFunction1(value))
        
        @scala.inline
        def setOnSelectUndefined: Self = StObject.set(x, "onSelect", js.undefined)
        
        @scala.inline
        def setSetSelect(value: js.Tuple4[Double, Double, Double, Double]): Self = StObject.set(x, "setSelect", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setSetSelectUndefined: Self = StObject.set(x, "setSelect", js.undefined)
        
        @scala.inline
        def setShade(value: Boolean): Self = StObject.set(x, "shade", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setShadeNull: Self = StObject.set(x, "shade", null)
        
        @scala.inline
        def setShadeUndefined: Self = StObject.set(x, "shade", js.undefined)
        
        @scala.inline
        def setSwingSpeed(value: Double): Self = StObject.set(x, "swingSpeed", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setSwingSpeedUndefined: Self = StObject.set(x, "swingSpeed", js.undefined)
        
        @scala.inline
        def setTouchSupport(value: Boolean): Self = StObject.set(x, "touchSupport", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setTouchSupportNull: Self = StObject.set(x, "touchSupport", null)
        
        @scala.inline
        def setTouchSupportUndefined: Self = StObject.set(x, "touchSupport", js.undefined)
        
        @scala.inline
        def setTrackDocument(value: Boolean): Self = StObject.set(x, "trackDocument", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setTrackDocumentUndefined: Self = StObject.set(x, "trackDocument", js.undefined)
        
        @scala.inline
        def setTrueSize(value: js.Tuple2[Double, Double]): Self = StObject.set(x, "trueSize", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setTrueSizeUndefined: Self = StObject.set(x, "trueSize", js.undefined)
      }
    }
    
    @js.native
    trait SelectionInfo extends StObject {
      
      var h: Double = js.native
      
      var w: Double = js.native
      
      var x: Double = js.native
      
      var x2: Double = js.native
      
      var y: Double = js.native
      
      var y2: Double = js.native
    }
    object SelectionInfo {
      
      @scala.inline
      def apply(h: Double, w: Double, x: Double, x2: Double, y: Double, y2: Double): SelectionInfo = {
        val __obj = js.Dynamic.literal(h = h.asInstanceOf[js.Any], w = w.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], x2 = x2.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any], y2 = y2.asInstanceOf[js.Any])
        __obj.asInstanceOf[SelectionInfo]
      }
      
      @scala.inline
      implicit class SelectionInfoMutableBuilder[Self <: SelectionInfo] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setH(value: Double): Self = StObject.set(x, "h", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setW(value: Double): Self = StObject.set(x, "w", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setX2(value: Double): Self = StObject.set(x, "x2", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setY2(value: Double): Self = StObject.set(x, "y2", value.asInstanceOf[js.Any])
      }
    }
  }
}
