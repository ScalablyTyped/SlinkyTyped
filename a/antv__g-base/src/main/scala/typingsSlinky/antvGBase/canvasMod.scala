package typingsSlinky.antvGBase

import org.scalajs.dom.raw.Event
import org.scalajs.dom.raw.HTMLElement
import org.scalajs.dom.raw.SVGSVGElement
import typingsSlinky.antvGBase.anon.X
import typingsSlinky.antvGBase.typesMod.CanvasCfg
import typingsSlinky.antvGBase.typesMod.Cursor
import typingsSlinky.antvGBase.typesMod.Point
import typingsSlinky.antvGBase.typesMod.Renderer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object canvasMod {
  
  @JSImport("@antv/g-base/lib/abstract/canvas", JSImport.Default)
  @js.native
  abstract class default protected () extends Canvas {
    def this(cfg: CanvasCfg) = this()
  }
  
  /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
  - typingsSlinky.antvGBase.interfacesMod.IObservable because Already inherited
  - typingsSlinky.antvGBase.interfacesMod.IBase because Already inherited
  - typingsSlinky.antvGBase.interfacesMod.IElement because Already inherited
  - typingsSlinky.antvGBase.interfacesMod.IContainer because Already inherited
  - typingsSlinky.antvGBase.interfacesMod.ICanvas because var conflicts: cfg, destroyed. Inlined getRenderer, getCursor, setCursor, changeSize, getPointByEvent, getClientByEvent, getPointByClient, getClientByPoint, draw */ @js.native
  trait Canvas
    extends typingsSlinky.antvGBase.containerMod.default {
    
    /**
      * 改变画布大小
      * @param {number} width  宽度
      * @param {number} height 高度
      */
    def changeSize(width: Double, height: Double): js.Any = js.native
    @JSName("changeSize")
    def changeSize_Unit(width: Double, height: Double): Unit = js.native
    
    /**
      * @protected
      * 清理所有的事件
      */
    def clearEvents(): Unit = js.native
    
    /**
      * 创建画布容器
      * @return {HTMLElement} 画布容器
      */
    def createDom(): HTMLElement | SVGSVGElement = js.native
    
    /**
      * 绘制
      */
    def draw(): js.Any = js.native
    @JSName("draw")
    def draw_Unit(): Unit = js.native
    
    def getClientByEvent(ev: Event): X = js.native
    /**
      * 根据事件对象获取窗口坐标
      * @param  {Event} ev 事件对象
      * @return {object} 窗口坐标
      */
    @JSName("getClientByEvent")
    def getClientByEvent_Point(ev: Event): Point = js.native
    
    /**
      * 将 canvas 坐标转换成窗口坐标
      * @param {number} x canvas 上的 x 坐标
      * @param {number} y canvas 上的 y 坐标
      * @returns {object} 窗口坐标
      */
    def getClientByPoint(x: Double, y: Double): Point = js.native
    
    /**
      * 获取画布的 cursor 样式
      * @return {Cursor}
      */
    def getCursor(): Cursor = js.native
    
    /**
      * 将窗口坐标转变成画布坐标
      * @param  {number} clientX 窗口 x 坐标
      * @param  {number} clientY 窗口 y 坐标
      * @return {object} 画布坐标
      */
    def getPointByClient(clientX: Double, clientY: Double): Point = js.native
    
    /**
      * 根据事件对象获取画布坐标
      * @param  {Event} ev 事件对象
      * @return {object} 画布坐标
      */
    def getPointByEvent(ev: Event): Point = js.native
    
    /**
      * 获取当前的渲染引擎
      * @return {Renderer} 返回当前的渲染引擎
      */
    def getRenderer(): Renderer = js.native
    
    /**
      * @protected
      * 初始化容器
      */
    def initContainer(): Unit = js.native
    
    /**
      * @protected
      * 初始化 DOM
      */
    def initDom(): Unit = js.native
    
    /**
      * @protected
      * 初始化绑定的事件
      */
    def initEvents(): Unit = js.native
    
    /**
      * @protected
      * 初始化时间轴
      */
    def initTimeline(): Unit = js.native
    
    /**
      * @protected
      * 销毁 DOM 容器
      */
    def removeDom(): Unit = js.native
    
    /**
      * 设置画布的 cursor 样式
      * @param {Cursor} cursor  cursor 样式
      */
    def setCursor(cursor: Cursor): js.Any = js.native
    /**
      * 设置画布的 cursor 样式
      * @param {Cursor} cursor  cursor 样式
      */
    @JSName("setCursor")
    def setCursor_Unit(cursor: Cursor): Unit = js.native
    
    /**
      * @protected
      * 修改画布对应的 DOM 的大小
      * @param {number} width  宽度
      * @param {number} height 高度
      */
    def setDOMSize(width: Double, height: Double): Unit = js.native
  }
}
