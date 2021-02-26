package typingsSlinky.antvGBase

import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.raw.HTMLElement
import typingsSlinky.antvGBase.antvGBaseStrings.`small-caps`
import typingsSlinky.antvGBase.antvGBaseStrings.a_
import typingsSlinky.antvGBase.antvGBaseStrings.alphabetic
import typingsSlinky.antvGBase.antvGBaseStrings.bevel
import typingsSlinky.antvGBase.antvGBaseStrings.bold
import typingsSlinky.antvGBase.antvGBaseStrings.bolder
import typingsSlinky.antvGBase.antvGBaseStrings.bottom
import typingsSlinky.antvGBase.antvGBaseStrings.butt
import typingsSlinky.antvGBase.antvGBaseStrings.c_
import typingsSlinky.antvGBase.antvGBaseStrings.center
import typingsSlinky.antvGBase.antvGBaseStrings.end
import typingsSlinky.antvGBase.antvGBaseStrings.h_
import typingsSlinky.antvGBase.antvGBaseStrings.hanging
import typingsSlinky.antvGBase.antvGBaseStrings.ideographic
import typingsSlinky.antvGBase.antvGBaseStrings.italic
import typingsSlinky.antvGBase.antvGBaseStrings.l_
import typingsSlinky.antvGBase.antvGBaseStrings.left
import typingsSlinky.antvGBase.antvGBaseStrings.lighter
import typingsSlinky.antvGBase.antvGBaseStrings.m_
import typingsSlinky.antvGBase.antvGBaseStrings.middle
import typingsSlinky.antvGBase.antvGBaseStrings.miter
import typingsSlinky.antvGBase.antvGBaseStrings.normal
import typingsSlinky.antvGBase.antvGBaseStrings.o_
import typingsSlinky.antvGBase.antvGBaseStrings.oblique
import typingsSlinky.antvGBase.antvGBaseStrings.q_
import typingsSlinky.antvGBase.antvGBaseStrings.r_
import typingsSlinky.antvGBase.antvGBaseStrings.right
import typingsSlinky.antvGBase.antvGBaseStrings.round
import typingsSlinky.antvGBase.antvGBaseStrings.s_
import typingsSlinky.antvGBase.antvGBaseStrings.square
import typingsSlinky.antvGBase.antvGBaseStrings.start
import typingsSlinky.antvGBase.antvGBaseStrings.t_
import typingsSlinky.antvGBase.antvGBaseStrings.top
import typingsSlinky.antvGBase.antvGBaseStrings.u_
import typingsSlinky.antvGBase.antvGBaseStrings.v_
import typingsSlinky.antvGBase.antvGBaseStrings.z_
import typingsSlinky.antvGBase.interfacesMod.ICtor
import typingsSlinky.antvGBase.interfacesMod.IShape
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesMod {
  
  type A = js.Tuple8[
    a_ | typingsSlinky.antvGBase.antvGBaseStrings.A, 
    Double, 
    Double, 
    Double, 
    Double, 
    Double, 
    Double, 
    Double
  ]
  
  @js.native
  trait AnimateCfg extends StObject {
    
    /**
      * 动画执行完时的回调函数
      * @type {function}}
      */
    var callback: js.UndefOr[js.Function0[Unit]] = js.native
    
    /**
      * 动画执行的延迟时间
      * @type {function}}
      */
    var delay: js.UndefOr[Double] = js.native
    
    /**
      * 动画执行时间
      * @type {number}
      */
    var duration: Double = js.native
    
    /**
      * 动画缓动效果
      * @type {string}}
      */
    var easing: js.UndefOr[String] = js.native
    
    /**
      * 动画暂停时的回调函数
      * @type {function}}
      */
    var pauseCallback: js.UndefOr[js.Function0[Unit]] = js.native
    
    /**
      * 是否重复执行动画
      * @type {boolean}}
      */
    var repeat: js.UndefOr[Boolean] = js.native
    
    /**
      * 动画恢复(重新唤醒)时的回调函数
      * @type {function}}
      */
    var resumeCallback: js.UndefOr[js.Function0[Unit]] = js.native
  }
  object AnimateCfg {
    
    @scala.inline
    def apply(duration: Double): AnimateCfg = {
      val __obj = js.Dynamic.literal(duration = duration.asInstanceOf[js.Any])
      __obj.asInstanceOf[AnimateCfg]
    }
    
    @scala.inline
    implicit class AnimateCfgMutableBuilder[Self <: AnimateCfg] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCallback(value: () => Unit): Self = StObject.set(x, "callback", js.Any.fromFunction0(value))
      
      @scala.inline
      def setCallbackUndefined: Self = StObject.set(x, "callback", js.undefined)
      
      @scala.inline
      def setDelay(value: Double): Self = StObject.set(x, "delay", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDelayUndefined: Self = StObject.set(x, "delay", js.undefined)
      
      @scala.inline
      def setDuration(value: Double): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEasing(value: String): Self = StObject.set(x, "easing", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEasingUndefined: Self = StObject.set(x, "easing", js.undefined)
      
      @scala.inline
      def setPauseCallback(value: () => Unit): Self = StObject.set(x, "pauseCallback", js.Any.fromFunction0(value))
      
      @scala.inline
      def setPauseCallbackUndefined: Self = StObject.set(x, "pauseCallback", js.undefined)
      
      @scala.inline
      def setRepeat(value: Boolean): Self = StObject.set(x, "repeat", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRepeatUndefined: Self = StObject.set(x, "repeat", js.undefined)
      
      @scala.inline
      def setResumeCallback(value: () => Unit): Self = StObject.set(x, "resumeCallback", js.Any.fromFunction0(value))
      
      @scala.inline
      def setResumeCallbackUndefined: Self = StObject.set(x, "resumeCallback", js.undefined)
    }
  }
  
  /* Inlined @antv/g-base.@antv/g-base/lib/types.AnimateCfg & {  id :string,   fromAttrs :{[key: string] : any},   toAttrs :{[key: string] : any},   startTime :number,   pathFormatted :boolean,   onFrame :@antv/g-base.@antv/g-base/lib/types.OnFrame | undefined,   _paused :boolean | undefined,   _pauseTime :number | undefined} */
  @js.native
  trait Animation extends StObject {
    
    var _pauseTime: js.UndefOr[Double] = js.native
    
    var _paused: js.UndefOr[Boolean] = js.native
    
    /**
      * 动画执行完时的回调函数
      * @type {function}}
      */
    var callback: js.UndefOr[js.Function0[Unit]] = js.native
    
    /**
      * 动画执行的延迟时间
      * @type {function}}
      */
    var delay: js.UndefOr[Double] = js.native
    
    /**
      * 动画执行时间
      * @type {number}
      */
    var duration: Double = js.native
    
    /**
      * 动画缓动效果
      * @type {string}}
      */
    var easing: js.UndefOr[String] = js.native
    
    var fromAttrs: StringDictionary[js.Any] = js.native
    
    var id: String = js.native
    
    var onFrame: js.UndefOr[OnFrame] = js.native
    
    var pathFormatted: Boolean = js.native
    
    /**
      * 动画暂停时的回调函数
      * @type {function}}
      */
    var pauseCallback: js.UndefOr[js.Function0[Unit]] = js.native
    
    /**
      * 是否重复执行动画
      * @type {boolean}}
      */
    var repeat: js.UndefOr[Boolean] = js.native
    
    /**
      * 动画恢复(重新唤醒)时的回调函数
      * @type {function}}
      */
    var resumeCallback: js.UndefOr[js.Function0[Unit]] = js.native
    
    var startTime: Double = js.native
    
    var toAttrs: StringDictionary[js.Any] = js.native
  }
  object Animation {
    
    @scala.inline
    def apply(
      duration: Double,
      fromAttrs: StringDictionary[js.Any],
      id: String,
      pathFormatted: Boolean,
      startTime: Double,
      toAttrs: StringDictionary[js.Any]
    ): Animation = {
      val __obj = js.Dynamic.literal(duration = duration.asInstanceOf[js.Any], fromAttrs = fromAttrs.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], pathFormatted = pathFormatted.asInstanceOf[js.Any], startTime = startTime.asInstanceOf[js.Any], toAttrs = toAttrs.asInstanceOf[js.Any])
      __obj.asInstanceOf[Animation]
    }
    
    @scala.inline
    implicit class AnimationMutableBuilder[Self <: Animation] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCallback(value: () => Unit): Self = StObject.set(x, "callback", js.Any.fromFunction0(value))
      
      @scala.inline
      def setCallbackUndefined: Self = StObject.set(x, "callback", js.undefined)
      
      @scala.inline
      def setDelay(value: Double): Self = StObject.set(x, "delay", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDelayUndefined: Self = StObject.set(x, "delay", js.undefined)
      
      @scala.inline
      def setDuration(value: Double): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEasing(value: String): Self = StObject.set(x, "easing", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEasingUndefined: Self = StObject.set(x, "easing", js.undefined)
      
      @scala.inline
      def setFromAttrs(value: StringDictionary[js.Any]): Self = StObject.set(x, "fromAttrs", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnFrame(value: /* ratio */ Double => ElementAttrs): Self = StObject.set(x, "onFrame", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnFrameUndefined: Self = StObject.set(x, "onFrame", js.undefined)
      
      @scala.inline
      def setPathFormatted(value: Boolean): Self = StObject.set(x, "pathFormatted", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPauseCallback(value: () => Unit): Self = StObject.set(x, "pauseCallback", js.Any.fromFunction0(value))
      
      @scala.inline
      def setPauseCallbackUndefined: Self = StObject.set(x, "pauseCallback", js.undefined)
      
      @scala.inline
      def setRepeat(value: Boolean): Self = StObject.set(x, "repeat", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRepeatUndefined: Self = StObject.set(x, "repeat", js.undefined)
      
      @scala.inline
      def setResumeCallback(value: () => Unit): Self = StObject.set(x, "resumeCallback", js.Any.fromFunction0(value))
      
      @scala.inline
      def setResumeCallbackUndefined: Self = StObject.set(x, "resumeCallback", js.undefined)
      
      @scala.inline
      def setStartTime(value: Double): Self = StObject.set(x, "startTime", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setToAttrs(value: StringDictionary[js.Any]): Self = StObject.set(x, "toAttrs", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set_pauseTime(value: Double): Self = StObject.set(x, "_pauseTime", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set_pauseTimeUndefined: Self = StObject.set(x, "_pauseTime", js.undefined)
      
      @scala.inline
      def set_paused(value: Boolean): Self = StObject.set(x, "_paused", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set_pausedUndefined: Self = StObject.set(x, "_paused", js.undefined)
    }
  }
  
  @js.native
  trait BBox extends StObject {
    
    var height: Double = js.native
    
    var maxX: Double = js.native
    
    var maxY: Double = js.native
    
    var minX: Double = js.native
    
    var minY: Double = js.native
    
    var width: Double = js.native
    
    var x: Double = js.native
    
    var y: Double = js.native
  }
  object BBox {
    
    @scala.inline
    def apply(
      height: Double,
      maxX: Double,
      maxY: Double,
      minX: Double,
      minY: Double,
      width: Double,
      x: Double,
      y: Double
    ): BBox = {
      val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], maxX = maxX.asInstanceOf[js.Any], maxY = maxY.asInstanceOf[js.Any], minX = minX.asInstanceOf[js.Any], minY = minY.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
      __obj.asInstanceOf[BBox]
    }
    
    @scala.inline
    implicit class BBoxMutableBuilder[Self <: BBox] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxX(value: Double): Self = StObject.set(x, "maxX", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxY(value: Double): Self = StObject.set(x, "maxY", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMinX(value: Double): Self = StObject.set(x, "minX", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMinY(value: Double): Self = StObject.set(x, "minY", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
    }
  }
  
  type C = js.Tuple7[
    c_ | typingsSlinky.antvGBase.antvGBaseStrings.C, 
    Double, 
    Double, 
    Double, 
    Double, 
    Double, 
    Double
  ]
  
  @js.native
  trait CanvasCfg
    extends /* key */ StringDictionary[js.Any] {
    
    /**
      * 是否可监听
      * @type {boolean}
      */
    var capture: js.UndefOr[Boolean] = js.native
    
    /**
      * 容器
      * @type {string|HTMLElement}
      */
    var container: String | HTMLElement = js.native
    
    /**
      * 画布的 cursor 样式
      * @type {Cursor}
      */
    var cursor: js.UndefOr[Cursor] = js.native
    
    /**
      * 画布高度
      * @type {number}
      */
    var height: Double = js.native
    
    /**
      * 只读属性，渲染引擎
      * @type {string}
      */
    var renderer: js.UndefOr[Renderer] = js.native
    
    /**
      * 画布宽度
      * @type {number}
      */
    var width: Double = js.native
  }
  object CanvasCfg {
    
    @scala.inline
    def apply(container: String | HTMLElement, height: Double, width: Double): CanvasCfg = {
      val __obj = js.Dynamic.literal(container = container.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
      __obj.asInstanceOf[CanvasCfg]
    }
    
    @scala.inline
    implicit class CanvasCfgMutableBuilder[Self <: CanvasCfg] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCapture(value: Boolean): Self = StObject.set(x, "capture", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCaptureUndefined: Self = StObject.set(x, "capture", js.undefined)
      
      @scala.inline
      def setContainer(value: String | HTMLElement): Self = StObject.set(x, "container", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContainerHTMLElement(value: HTMLElement): Self = StObject.set(x, "container", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCursor(value: Cursor): Self = StObject.set(x, "cursor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCursorUndefined: Self = StObject.set(x, "cursor", js.undefined)
      
      @scala.inline
      def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRenderer(value: Renderer): Self = StObject.set(x, "renderer", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRendererUndefined: Self = StObject.set(x, "renderer", js.undefined)
      
      @scala.inline
      def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.antvGBase.antvGBaseStrings.changeSize
    - typingsSlinky.antvGBase.antvGBaseStrings.add
    - typingsSlinky.antvGBase.antvGBaseStrings.sort
    - typingsSlinky.antvGBase.antvGBaseStrings.clear
    - typingsSlinky.antvGBase.antvGBaseStrings.attr
    - typingsSlinky.antvGBase.antvGBaseStrings.show
    - typingsSlinky.antvGBase.antvGBaseStrings.hide
    - typingsSlinky.antvGBase.antvGBaseStrings.zIndex
    - typingsSlinky.antvGBase.antvGBaseStrings.remove
    - typingsSlinky.antvGBase.antvGBaseStrings.matrix
    - typingsSlinky.antvGBase.antvGBaseStrings.clip
  */
  trait ChangeType extends StObject
  object ChangeType {
    
    @scala.inline
    def add: typingsSlinky.antvGBase.antvGBaseStrings.add = "add".asInstanceOf[typingsSlinky.antvGBase.antvGBaseStrings.add]
    
    @scala.inline
    def attr: typingsSlinky.antvGBase.antvGBaseStrings.attr = "attr".asInstanceOf[typingsSlinky.antvGBase.antvGBaseStrings.attr]
    
    @scala.inline
    def changeSize: typingsSlinky.antvGBase.antvGBaseStrings.changeSize = "changeSize".asInstanceOf[typingsSlinky.antvGBase.antvGBaseStrings.changeSize]
    
    @scala.inline
    def clear: typingsSlinky.antvGBase.antvGBaseStrings.clear = "clear".asInstanceOf[typingsSlinky.antvGBase.antvGBaseStrings.clear]
    
    @scala.inline
    def clip: typingsSlinky.antvGBase.antvGBaseStrings.clip = "clip".asInstanceOf[typingsSlinky.antvGBase.antvGBaseStrings.clip]
    
    @scala.inline
    def hide: typingsSlinky.antvGBase.antvGBaseStrings.hide = "hide".asInstanceOf[typingsSlinky.antvGBase.antvGBaseStrings.hide]
    
    @scala.inline
    def matrix: typingsSlinky.antvGBase.antvGBaseStrings.matrix = "matrix".asInstanceOf[typingsSlinky.antvGBase.antvGBaseStrings.matrix]
    
    @scala.inline
    def remove: typingsSlinky.antvGBase.antvGBaseStrings.remove = "remove".asInstanceOf[typingsSlinky.antvGBase.antvGBaseStrings.remove]
    
    @scala.inline
    def show: typingsSlinky.antvGBase.antvGBaseStrings.show = "show".asInstanceOf[typingsSlinky.antvGBase.antvGBaseStrings.show]
    
    @scala.inline
    def sort: typingsSlinky.antvGBase.antvGBaseStrings.sort = "sort".asInstanceOf[typingsSlinky.antvGBase.antvGBaseStrings.sort]
    
    @scala.inline
    def zIndex: typingsSlinky.antvGBase.antvGBaseStrings.zIndex = "zIndex".asInstanceOf[typingsSlinky.antvGBase.antvGBaseStrings.zIndex]
  }
  
  @js.native
  trait ClipCfg extends StObject {
    
    /**
      * 图形的属性
      * @type {ShapeAttrs}
      */
    var attrs: ShapeAttrs = js.native
    
    /**
      * 作为 clip 的图形
      * @type {string}
      */
    var `type`: String = js.native
  }
  object ClipCfg {
    
    @scala.inline
    def apply(attrs: ShapeAttrs, `type`: String): ClipCfg = {
      val __obj = js.Dynamic.literal(attrs = attrs.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[ClipCfg]
    }
    
    @scala.inline
    implicit class ClipCfgMutableBuilder[Self <: ClipCfg] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAttrs(value: ShapeAttrs): Self = StObject.set(x, "attrs", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  type ColorType = String | Null
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.antvGBase.antvGBaseStrings.auto
    - typingsSlinky.antvGBase.antvGBaseStrings.default
    - typingsSlinky.antvGBase.antvGBaseStrings.none
    - typingsSlinky.antvGBase.antvGBaseStrings.`context-menu`
    - typingsSlinky.antvGBase.antvGBaseStrings.help
    - typingsSlinky.antvGBase.antvGBaseStrings.pointer
    - typingsSlinky.antvGBase.antvGBaseStrings.progress
    - typingsSlinky.antvGBase.antvGBaseStrings.wait
    - typingsSlinky.antvGBase.antvGBaseStrings.cell
    - typingsSlinky.antvGBase.antvGBaseStrings.crosshair
    - typingsSlinky.antvGBase.antvGBaseStrings.text
    - typingsSlinky.antvGBase.antvGBaseStrings.`vertical-text`
    - typingsSlinky.antvGBase.antvGBaseStrings.alias
    - typingsSlinky.antvGBase.antvGBaseStrings.copy
    - typingsSlinky.antvGBase.antvGBaseStrings.move
    - typingsSlinky.antvGBase.antvGBaseStrings.`no-drop`
    - typingsSlinky.antvGBase.antvGBaseStrings.`not-allowed`
    - typingsSlinky.antvGBase.antvGBaseStrings.grab
    - typingsSlinky.antvGBase.antvGBaseStrings.grabbing
    - typingsSlinky.antvGBase.antvGBaseStrings.`all-scroll`
    - typingsSlinky.antvGBase.antvGBaseStrings.`col-resize`
    - typingsSlinky.antvGBase.antvGBaseStrings.`row-resize`
    - typingsSlinky.antvGBase.antvGBaseStrings.`n-resize`
    - typingsSlinky.antvGBase.antvGBaseStrings.`e-resize`
    - typingsSlinky.antvGBase.antvGBaseStrings.`s-resize`
    - typingsSlinky.antvGBase.antvGBaseStrings.`w-resize`
    - typingsSlinky.antvGBase.antvGBaseStrings.`ne-resize`
    - typingsSlinky.antvGBase.antvGBaseStrings.`nw-resize`
    - typingsSlinky.antvGBase.antvGBaseStrings.`se-resize`
    - typingsSlinky.antvGBase.antvGBaseStrings.`sw-resize`
    - typingsSlinky.antvGBase.antvGBaseStrings.`ew-resize`
    - typingsSlinky.antvGBase.antvGBaseStrings.`ns-resize`
    - typingsSlinky.antvGBase.antvGBaseStrings.`nesw-resize`
    - typingsSlinky.antvGBase.antvGBaseStrings.`nwse-resize`
    - typingsSlinky.antvGBase.antvGBaseStrings.`zoom-in`
    - typingsSlinky.antvGBase.antvGBaseStrings.`zoom-out`
  */
  trait Cursor extends StObject
  object Cursor {
    
    @scala.inline
    def default: typingsSlinky.antvGBase.antvGBaseStrings.default = "default".asInstanceOf[typingsSlinky.antvGBase.antvGBaseStrings.default]
    
    @scala.inline
    def alias: typingsSlinky.antvGBase.antvGBaseStrings.alias = "alias".asInstanceOf[typingsSlinky.antvGBase.antvGBaseStrings.alias]
    
    @scala.inline
    def `all-scroll`: typingsSlinky.antvGBase.antvGBaseStrings.`all-scroll` = "all-scroll".asInstanceOf[typingsSlinky.antvGBase.antvGBaseStrings.`all-scroll`]
    
    @scala.inline
    def auto: typingsSlinky.antvGBase.antvGBaseStrings.auto = "auto".asInstanceOf[typingsSlinky.antvGBase.antvGBaseStrings.auto]
    
    @scala.inline
    def cell: typingsSlinky.antvGBase.antvGBaseStrings.cell = "cell".asInstanceOf[typingsSlinky.antvGBase.antvGBaseStrings.cell]
    
    @scala.inline
    def `col-resize`: typingsSlinky.antvGBase.antvGBaseStrings.`col-resize` = "col-resize".asInstanceOf[typingsSlinky.antvGBase.antvGBaseStrings.`col-resize`]
    
    @scala.inline
    def `context-menu`: typingsSlinky.antvGBase.antvGBaseStrings.`context-menu` = "context-menu".asInstanceOf[typingsSlinky.antvGBase.antvGBaseStrings.`context-menu`]
    
    @scala.inline
    def copy: typingsSlinky.antvGBase.antvGBaseStrings.copy = "copy".asInstanceOf[typingsSlinky.antvGBase.antvGBaseStrings.copy]
    
    @scala.inline
    def crosshair: typingsSlinky.antvGBase.antvGBaseStrings.crosshair = "crosshair".asInstanceOf[typingsSlinky.antvGBase.antvGBaseStrings.crosshair]
    
    @scala.inline
    def `e-resize`: typingsSlinky.antvGBase.antvGBaseStrings.`e-resize` = "e-resize".asInstanceOf[typingsSlinky.antvGBase.antvGBaseStrings.`e-resize`]
    
    @scala.inline
    def `ew-resize`: typingsSlinky.antvGBase.antvGBaseStrings.`ew-resize` = "ew-resize".asInstanceOf[typingsSlinky.antvGBase.antvGBaseStrings.`ew-resize`]
    
    @scala.inline
    def grab: typingsSlinky.antvGBase.antvGBaseStrings.grab = "grab".asInstanceOf[typingsSlinky.antvGBase.antvGBaseStrings.grab]
    
    @scala.inline
    def grabbing: typingsSlinky.antvGBase.antvGBaseStrings.grabbing = "grabbing".asInstanceOf[typingsSlinky.antvGBase.antvGBaseStrings.grabbing]
    
    @scala.inline
    def help: typingsSlinky.antvGBase.antvGBaseStrings.help = "help".asInstanceOf[typingsSlinky.antvGBase.antvGBaseStrings.help]
    
    @scala.inline
    def move: typingsSlinky.antvGBase.antvGBaseStrings.move = "move".asInstanceOf[typingsSlinky.antvGBase.antvGBaseStrings.move]
    
    @scala.inline
    def `n-resize`: typingsSlinky.antvGBase.antvGBaseStrings.`n-resize` = "n-resize".asInstanceOf[typingsSlinky.antvGBase.antvGBaseStrings.`n-resize`]
    
    @scala.inline
    def `ne-resize`: typingsSlinky.antvGBase.antvGBaseStrings.`ne-resize` = "ne-resize".asInstanceOf[typingsSlinky.antvGBase.antvGBaseStrings.`ne-resize`]
    
    @scala.inline
    def `nesw-resize`: typingsSlinky.antvGBase.antvGBaseStrings.`nesw-resize` = "nesw-resize".asInstanceOf[typingsSlinky.antvGBase.antvGBaseStrings.`nesw-resize`]
    
    @scala.inline
    def `no-drop`: typingsSlinky.antvGBase.antvGBaseStrings.`no-drop` = "no-drop".asInstanceOf[typingsSlinky.antvGBase.antvGBaseStrings.`no-drop`]
    
    @scala.inline
    def none: typingsSlinky.antvGBase.antvGBaseStrings.none = "none".asInstanceOf[typingsSlinky.antvGBase.antvGBaseStrings.none]
    
    @scala.inline
    def `not-allowed`: typingsSlinky.antvGBase.antvGBaseStrings.`not-allowed` = "not-allowed".asInstanceOf[typingsSlinky.antvGBase.antvGBaseStrings.`not-allowed`]
    
    @scala.inline
    def `ns-resize`: typingsSlinky.antvGBase.antvGBaseStrings.`ns-resize` = "ns-resize".asInstanceOf[typingsSlinky.antvGBase.antvGBaseStrings.`ns-resize`]
    
    @scala.inline
    def `nw-resize`: typingsSlinky.antvGBase.antvGBaseStrings.`nw-resize` = "nw-resize".asInstanceOf[typingsSlinky.antvGBase.antvGBaseStrings.`nw-resize`]
    
    @scala.inline
    def `nwse-resize`: typingsSlinky.antvGBase.antvGBaseStrings.`nwse-resize` = "nwse-resize".asInstanceOf[typingsSlinky.antvGBase.antvGBaseStrings.`nwse-resize`]
    
    @scala.inline
    def pointer: typingsSlinky.antvGBase.antvGBaseStrings.pointer = "pointer".asInstanceOf[typingsSlinky.antvGBase.antvGBaseStrings.pointer]
    
    @scala.inline
    def progress: typingsSlinky.antvGBase.antvGBaseStrings.progress = "progress".asInstanceOf[typingsSlinky.antvGBase.antvGBaseStrings.progress]
    
    @scala.inline
    def `row-resize`: typingsSlinky.antvGBase.antvGBaseStrings.`row-resize` = "row-resize".asInstanceOf[typingsSlinky.antvGBase.antvGBaseStrings.`row-resize`]
    
    @scala.inline
    def `s-resize`: typingsSlinky.antvGBase.antvGBaseStrings.`s-resize` = "s-resize".asInstanceOf[typingsSlinky.antvGBase.antvGBaseStrings.`s-resize`]
    
    @scala.inline
    def `se-resize`: typingsSlinky.antvGBase.antvGBaseStrings.`se-resize` = "se-resize".asInstanceOf[typingsSlinky.antvGBase.antvGBaseStrings.`se-resize`]
    
    @scala.inline
    def `sw-resize`: typingsSlinky.antvGBase.antvGBaseStrings.`sw-resize` = "sw-resize".asInstanceOf[typingsSlinky.antvGBase.antvGBaseStrings.`sw-resize`]
    
    @scala.inline
    def text: typingsSlinky.antvGBase.antvGBaseStrings.text = "text".asInstanceOf[typingsSlinky.antvGBase.antvGBaseStrings.text]
    
    @scala.inline
    def `vertical-text`: typingsSlinky.antvGBase.antvGBaseStrings.`vertical-text` = "vertical-text".asInstanceOf[typingsSlinky.antvGBase.antvGBaseStrings.`vertical-text`]
    
    @scala.inline
    def `w-resize`: typingsSlinky.antvGBase.antvGBaseStrings.`w-resize` = "w-resize".asInstanceOf[typingsSlinky.antvGBase.antvGBaseStrings.`w-resize`]
    
    @scala.inline
    def `zoom-in`: typingsSlinky.antvGBase.antvGBaseStrings.`zoom-in` = "zoom-in".asInstanceOf[typingsSlinky.antvGBase.antvGBaseStrings.`zoom-in`]
    
    @scala.inline
    def `zoom-out`: typingsSlinky.antvGBase.antvGBaseStrings.`zoom-out` = "zoom-out".asInstanceOf[typingsSlinky.antvGBase.antvGBaseStrings.`zoom-out`]
  }
  
  type ElementAttrs = StringDictionary[js.Any]
  
  @js.native
  trait ElementCfg extends StObject {
    
    /**
      * 是否可以拾取
      * @type {Boolean}
      */
    var capture: js.UndefOr[Boolean] = js.native
    
    /**
      * 元素 id,可以为空
      * @type {String}
      */
    var id: js.UndefOr[String] = js.native
    
    /**
      * 是否可见
      * @type {Boolean}
      */
    var visible: js.UndefOr[Boolean] = js.native
    
    /**
      * 层次索引，决定绘制的先后顺序
      * @type {Number}
      */
    var zIndex: js.UndefOr[Double] = js.native
  }
  object ElementCfg {
    
    @scala.inline
    def apply(): ElementCfg = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ElementCfg]
    }
    
    @scala.inline
    implicit class ElementCfgMutableBuilder[Self <: ElementCfg] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCapture(value: Boolean): Self = StObject.set(x, "capture", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCaptureUndefined: Self = StObject.set(x, "capture", js.undefined)
      
      @scala.inline
      def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
      
      @scala.inline
      def setVisible(value: Boolean): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVisibleUndefined: Self = StObject.set(x, "visible", js.undefined)
      
      @scala.inline
      def setZIndex(value: Double): Self = StObject.set(x, "zIndex", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setZIndexUndefined: Self = StObject.set(x, "zIndex", js.undefined)
    }
  }
  
  type ElementFilterFn = js.Function1[/* IElement */ js.Any, Boolean]
  
  type GroupCfg = StringDictionary[js.Any]
  
  type H = js.Tuple2[h_ | typingsSlinky.antvGBase.antvGBaseStrings.H, Double]
  
  type L = js.Tuple3[l_ | typingsSlinky.antvGBase.antvGBaseStrings.L, Double, Double]
  
  type LooseObject = StringDictionary[js.Any]
  
  type M = js.Tuple3[m_ | typingsSlinky.antvGBase.antvGBaseStrings.M, Double, Double]
  
  type O = js.Tuple3[o_ | typingsSlinky.antvGBase.antvGBaseStrings.O, Double, Double]
  
  type OnFrame = js.Function1[/* ratio */ Double, ElementAttrs]
  
  type PathCommand = A | C | O | H | L | M | R | Q | S | T | V | U | Z
  
  @js.native
  trait Point extends StObject {
    
    var x: Double = js.native
    
    var y: Double = js.native
  }
  object Point {
    
    @scala.inline
    def apply(x: Double, y: Double): Point = {
      val __obj = js.Dynamic.literal(x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
      __obj.asInstanceOf[Point]
    }
    
    @scala.inline
    implicit class PointMutableBuilder[Self <: Point] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
    }
  }
  
  type Q = js.Tuple5[q_ | typingsSlinky.antvGBase.antvGBaseStrings.Q, Double, Double, Double, Double]
  
  type R = js.Tuple5[r_ | typingsSlinky.antvGBase.antvGBaseStrings.R, Double, Double, Double, Double]
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.antvGBase.antvGBaseStrings.canvas
    - typingsSlinky.antvGBase.antvGBaseStrings.svg
  */
  trait Renderer extends StObject
  object Renderer {
    
    @scala.inline
    def canvas: typingsSlinky.antvGBase.antvGBaseStrings.canvas = "canvas".asInstanceOf[typingsSlinky.antvGBase.antvGBaseStrings.canvas]
    
    @scala.inline
    def svg: typingsSlinky.antvGBase.antvGBaseStrings.svg = "svg".asInstanceOf[typingsSlinky.antvGBase.antvGBaseStrings.svg]
  }
  
  type S = js.Tuple8[
    s_ | typingsSlinky.antvGBase.antvGBaseStrings.S, 
    Double, 
    Double, 
    Double, 
    Double, 
    Double, 
    Double, 
    Double
  ]
  
  @js.native
  trait ShapeAttrs
    extends /* key */ StringDictionary[js.Any] {
    
    /** 填充颜色 */
    var fill: js.UndefOr[ColorType] = js.native
    
    /** 填充透明度 */
    var fillOpacity: js.UndefOr[Double] = js.native
    
    /** 文本字体 */
    var fontFamily: js.UndefOr[String] = js.native
    
    /** 文本字体大小 */
    var fontSize: js.UndefOr[Double] = js.native
    
    /** 字体样式 */
    var fontStyle: js.UndefOr[normal | italic | oblique] = js.native
    
    /** 字体变体 */
    var fontVariant: js.UndefOr[normal | `small-caps` | String] = js.native
    
    /** 文本粗细 */
    var fontWeight: js.UndefOr[normal | bold | bolder | lighter | Double] = js.native
    
    /** 高度 */
    var height: js.UndefOr[Double] = js.native
    
    /** 指定如何绘制每一条线段末端 */
    var lineCap: js.UndefOr[butt | round | square] = js.native
    
    /**
      * 设置线的虚线样式，可以指定一个数组。一组描述交替绘制线段和间距（坐标空间单位）长度的数字。 如果数组元素的数量是奇数， 数组的元素会被复制并重复。例如， [5, 15, 25] 会变成 [5, 15, 25, 5, 15, 25]。这个属性取决于浏览器是否支持 setLineDash() 函数。
      */
    var lineDash: js.UndefOr[js.Array[Double] | Null] = js.native
    
    /** 文本行高 */
    var lineHeight: js.UndefOr[Double] = js.native
    
    /** 用来设置2个长度不为0的相连部分（线段，圆弧，曲线）如何连接在一起的属性（长度为0的变形部分，其指定的末端和控制点在同一位置，会被忽略） */
    var lineJoin: js.UndefOr[bevel | round | miter] = js.native
    
    /** 线宽 */
    var lineWidth: js.UndefOr[Double] = js.native
    
    /** 整体透明度 */
    var opacity: js.UndefOr[Double] = js.native
    
    /** Path 路径 */
    var path: js.UndefOr[String | js.Array[js.Object]] = js.native
    
    /** 图形坐标点 */
    var points: js.UndefOr[js.Array[js.Object]] = js.native
    
    /** 圆半径 */
    var r: js.UndefOr[Double] = js.native
    
    /** 阴影模糊效果程度 */
    var shadowBlur: js.UndefOr[Double] = js.native
    
    /** 阴影颜色 */
    var shadowColor: js.UndefOr[ColorType] = js.native
    
    /** 阴影 x 方向偏移量 */
    var shadowOffsetX: js.UndefOr[Double] = js.native
    
    /** 阴影 y 方向偏移量 */
    var shadowOffsetY: js.UndefOr[Double] = js.native
    
    /** 描边颜色 */
    var stroke: js.UndefOr[ColorType] = js.native
    
    /** 描边透明度 */
    var strokeOpacity: js.UndefOr[Double] = js.native
    
    /** 设置文本内容的当前对齐方式 */
    var textAlign: js.UndefOr[start | center | end | left | right] = js.native
    
    /** 设置在绘制文本时使用的当前文本基线 */
    var textBaseline: js.UndefOr[top | hanging | middle | alphabetic | ideographic | bottom] = js.native
    
    /** 宽度 */
    var width: js.UndefOr[Double] = js.native
    
    /** x 坐标 */
    var x: js.UndefOr[Double] = js.native
    
    /** y 坐标 */
    var y: js.UndefOr[Double] = js.native
  }
  object ShapeAttrs {
    
    @scala.inline
    def apply(): ShapeAttrs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ShapeAttrs]
    }
    
    @scala.inline
    implicit class ShapeAttrsMutableBuilder[Self <: ShapeAttrs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFill(value: ColorType): Self = StObject.set(x, "fill", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFillNull: Self = StObject.set(x, "fill", null)
      
      @scala.inline
      def setFillOpacity(value: Double): Self = StObject.set(x, "fillOpacity", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFillOpacityUndefined: Self = StObject.set(x, "fillOpacity", js.undefined)
      
      @scala.inline
      def setFillUndefined: Self = StObject.set(x, "fill", js.undefined)
      
      @scala.inline
      def setFontFamily(value: String): Self = StObject.set(x, "fontFamily", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFontFamilyUndefined: Self = StObject.set(x, "fontFamily", js.undefined)
      
      @scala.inline
      def setFontSize(value: Double): Self = StObject.set(x, "fontSize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFontSizeUndefined: Self = StObject.set(x, "fontSize", js.undefined)
      
      @scala.inline
      def setFontStyle(value: normal | italic | oblique): Self = StObject.set(x, "fontStyle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFontStyleUndefined: Self = StObject.set(x, "fontStyle", js.undefined)
      
      @scala.inline
      def setFontVariant(value: normal | `small-caps` | String): Self = StObject.set(x, "fontVariant", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFontVariantUndefined: Self = StObject.set(x, "fontVariant", js.undefined)
      
      @scala.inline
      def setFontWeight(value: normal | bold | bolder | lighter | Double): Self = StObject.set(x, "fontWeight", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFontWeightUndefined: Self = StObject.set(x, "fontWeight", js.undefined)
      
      @scala.inline
      def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
      
      @scala.inline
      def setLineCap(value: butt | round | square): Self = StObject.set(x, "lineCap", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLineCapUndefined: Self = StObject.set(x, "lineCap", js.undefined)
      
      @scala.inline
      def setLineDash(value: js.Array[Double]): Self = StObject.set(x, "lineDash", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLineDashNull: Self = StObject.set(x, "lineDash", null)
      
      @scala.inline
      def setLineDashUndefined: Self = StObject.set(x, "lineDash", js.undefined)
      
      @scala.inline
      def setLineDashVarargs(value: Double*): Self = StObject.set(x, "lineDash", js.Array(value :_*))
      
      @scala.inline
      def setLineHeight(value: Double): Self = StObject.set(x, "lineHeight", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLineHeightUndefined: Self = StObject.set(x, "lineHeight", js.undefined)
      
      @scala.inline
      def setLineJoin(value: bevel | round | miter): Self = StObject.set(x, "lineJoin", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLineJoinUndefined: Self = StObject.set(x, "lineJoin", js.undefined)
      
      @scala.inline
      def setLineWidth(value: Double): Self = StObject.set(x, "lineWidth", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLineWidthUndefined: Self = StObject.set(x, "lineWidth", js.undefined)
      
      @scala.inline
      def setOpacity(value: Double): Self = StObject.set(x, "opacity", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOpacityUndefined: Self = StObject.set(x, "opacity", js.undefined)
      
      @scala.inline
      def setPath(value: String | js.Array[js.Object]): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
      
      @scala.inline
      def setPathVarargs(value: js.Object*): Self = StObject.set(x, "path", js.Array(value :_*))
      
      @scala.inline
      def setPoints(value: js.Array[js.Object]): Self = StObject.set(x, "points", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPointsUndefined: Self = StObject.set(x, "points", js.undefined)
      
      @scala.inline
      def setPointsVarargs(value: js.Object*): Self = StObject.set(x, "points", js.Array(value :_*))
      
      @scala.inline
      def setR(value: Double): Self = StObject.set(x, "r", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRUndefined: Self = StObject.set(x, "r", js.undefined)
      
      @scala.inline
      def setShadowBlur(value: Double): Self = StObject.set(x, "shadowBlur", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShadowBlurUndefined: Self = StObject.set(x, "shadowBlur", js.undefined)
      
      @scala.inline
      def setShadowColor(value: ColorType): Self = StObject.set(x, "shadowColor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShadowColorNull: Self = StObject.set(x, "shadowColor", null)
      
      @scala.inline
      def setShadowColorUndefined: Self = StObject.set(x, "shadowColor", js.undefined)
      
      @scala.inline
      def setShadowOffsetX(value: Double): Self = StObject.set(x, "shadowOffsetX", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShadowOffsetXUndefined: Self = StObject.set(x, "shadowOffsetX", js.undefined)
      
      @scala.inline
      def setShadowOffsetY(value: Double): Self = StObject.set(x, "shadowOffsetY", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShadowOffsetYUndefined: Self = StObject.set(x, "shadowOffsetY", js.undefined)
      
      @scala.inline
      def setStroke(value: ColorType): Self = StObject.set(x, "stroke", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStrokeNull: Self = StObject.set(x, "stroke", null)
      
      @scala.inline
      def setStrokeOpacity(value: Double): Self = StObject.set(x, "strokeOpacity", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStrokeOpacityUndefined: Self = StObject.set(x, "strokeOpacity", js.undefined)
      
      @scala.inline
      def setStrokeUndefined: Self = StObject.set(x, "stroke", js.undefined)
      
      @scala.inline
      def setTextAlign(value: start | center | end | left | right): Self = StObject.set(x, "textAlign", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTextAlignUndefined: Self = StObject.set(x, "textAlign", js.undefined)
      
      @scala.inline
      def setTextBaseline(value: top | hanging | middle | alphabetic | ideographic | bottom): Self = StObject.set(x, "textBaseline", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTextBaselineUndefined: Self = StObject.set(x, "textBaseline", js.undefined)
      
      @scala.inline
      def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
      
      @scala.inline
      def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setXUndefined: Self = StObject.set(x, "x", js.undefined)
      
      @scala.inline
      def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setYUndefined: Self = StObject.set(x, "y", js.undefined)
    }
  }
  
  type ShapeBase = StringDictionary[ICtor[IShape]]
  
  /* Inlined @antv/g-base.@antv/g-base/lib/types.ElementCfg & {  attrs :@antv/g-base.@antv/g-base/lib/types.ShapeAttrs, [key: string] : any} */
  @js.native
  trait ShapeCfg
    extends /* key */ StringDictionary[js.Any] {
    
    /**
      * 图形的属性
      * @type {ShapeAttrs}
      */
    var attrs: ShapeAttrs = js.native
    
    /**
      * 是否可以拾取
      * @type {Boolean}
      */
    var capture: js.UndefOr[Boolean] = js.native
    
    /**
      * 元素 id,可以为空
      * @type {String}
      */
    var id: js.UndefOr[String] = js.native
    
    /**
      * 是否可见
      * @type {Boolean}
      */
    var visible: js.UndefOr[Boolean] = js.native
    
    /**
      * 层次索引，决定绘制的先后顺序
      * @type {Number}
      */
    var zIndex: js.UndefOr[Double] = js.native
  }
  object ShapeCfg {
    
    @scala.inline
    def apply(attrs: ShapeAttrs): ShapeCfg = {
      val __obj = js.Dynamic.literal(attrs = attrs.asInstanceOf[js.Any])
      __obj.asInstanceOf[ShapeCfg]
    }
    
    @scala.inline
    implicit class ShapeCfgMutableBuilder[Self <: ShapeCfg] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAttrs(value: ShapeAttrs): Self = StObject.set(x, "attrs", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCapture(value: Boolean): Self = StObject.set(x, "capture", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCaptureUndefined: Self = StObject.set(x, "capture", js.undefined)
      
      @scala.inline
      def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
      
      @scala.inline
      def setVisible(value: Boolean): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVisibleUndefined: Self = StObject.set(x, "visible", js.undefined)
      
      @scala.inline
      def setZIndex(value: Double): Self = StObject.set(x, "zIndex", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setZIndexUndefined: Self = StObject.set(x, "zIndex", js.undefined)
    }
  }
  
  @js.native
  trait SimpleBBox extends StObject {
    
    var height: Double = js.native
    
    var width: Double = js.native
    
    var x: Double = js.native
    
    var y: Double = js.native
  }
  object SimpleBBox {
    
    @scala.inline
    def apply(height: Double, width: Double, x: Double, y: Double): SimpleBBox = {
      val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
      __obj.asInstanceOf[SimpleBBox]
    }
    
    @scala.inline
    implicit class SimpleBBoxMutableBuilder[Self <: SimpleBBox] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
    }
  }
  
  type T = js.Tuple3[t_ | typingsSlinky.antvGBase.antvGBaseStrings.T, Double, Double]
  
  type U = js.Tuple4[u_ | typingsSlinky.antvGBase.antvGBaseStrings.U, Double, Double, Double]
  
  type V = js.Tuple2[v_ | typingsSlinky.antvGBase.antvGBaseStrings.V, Double]
  
  type Z = js.Array[z_ | typingsSlinky.antvGBase.antvGBaseStrings.Z]
}
