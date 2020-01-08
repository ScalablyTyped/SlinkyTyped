package typingsSlinky.ol

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.ol.eventsMod.EventsKey
import typingsSlinky.ol.objectMod.ObjectEvent
import typingsSlinky.ol.olStrings.changeColongeometry
import typingsSlinky.ol.styleStyleMod.StyleFunction
import typingsSlinky.ol.styleStyleMod.StyleLike
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ol/Feature", JSImport.Namespace)
@js.native
object featureMod extends js.Object {
  @js.native
  trait Feature
    extends typingsSlinky.ol.objectMod.default
       with FeatureClass
       with FeatureLike {
    def getGeometry(): js.UndefOr[typingsSlinky.ol.geomGeometryMod.default] = js.native
    def getGeometryName(): String = js.native
    def getId(): js.UndefOr[Double | String] = js.native
    def getStyle(): StyleLike | Null = js.native
    def getStyleFunction(): js.UndefOr[StyleFunction] = js.native
    @JSName("on")
    def on_changegeometry(`type`: changeColongeometry, listener: js.Function1[/* evt */ ObjectEvent, Unit]): EventsKey = js.native
    @JSName("once")
    def once_changegeometry(`type`: changeColongeometry, listener: js.Function1[/* evt */ ObjectEvent, Unit]): EventsKey = js.native
    def setGeometry(): Unit = js.native
    def setGeometry(geometry: typingsSlinky.ol.geomGeometryMod.default): Unit = js.native
    def setGeometryName(name: String): Unit = js.native
    def setId(): Unit = js.native
    def setId(id: String): Unit = js.native
    def setId(id: Double): Unit = js.native
    def setStyle(): Unit = js.native
    def setStyle(style: StyleLike): Unit = js.native
    @JSName("un")
    def un_changegeometry(`type`: changeColongeometry, listener: js.Function1[/* evt */ ObjectEvent, Unit]): Unit = js.native
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.ol.featureMod.Feature
    - typings.ol.renderFeatureMod.default
  */
  trait FeatureClass extends js.Object
  
  /* Rewritten from type alias, can be one of: 
    - typings.ol.featureMod.Feature
    - typings.ol.renderFeatureMod.default
  */
  trait FeatureLike extends js.Object
  
  @js.native
  class default () extends Feature {
    def this(opt_geometryOrProperties: StringDictionary[js.Any]) = this()
    def this(opt_geometryOrProperties: typingsSlinky.ol.geomGeometryMod.default) = this()
  }
  
  def createStyleFunction(obj: js.Array[typingsSlinky.ol.styleStyleMod.default]): StyleFunction = js.native
  def createStyleFunction(obj: StyleFunction): StyleFunction = js.native
  def createStyleFunction(obj: typingsSlinky.ol.styleStyleMod.default): StyleFunction = js.native
}

