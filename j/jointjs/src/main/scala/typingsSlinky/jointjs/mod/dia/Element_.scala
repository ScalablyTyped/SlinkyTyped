package typingsSlinky.jointjs.mod.dia

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.jointjs.anon.Deep
import typingsSlinky.jointjs.anon.Dictkey
import typingsSlinky.jointjs.mod.dia.Cell.EmbeddableOptions
import typingsSlinky.jointjs.mod.dia.Element.Attributes
import typingsSlinky.jointjs.mod.dia.Element.Port
import typingsSlinky.jointjs.mod.dia.Element.PortPosition
import typingsSlinky.jointjs.mod.dia.Element.TranslateOptions
import typingsSlinky.jointjs.mod.dia.Graph.Options
import typingsSlinky.jointjs.mod.g.Rect
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("jointjs", "dia.Element")
@js.native
class Element_ () extends Cell {
  def this(attributes: Attributes) = this()
  def this(attributes: js.UndefOr[scala.Nothing], opt: Options) = this()
  def this(attributes: Attributes, opt: Options) = this()
  def addPort(port: Port): this.type = js.native
  def addPort(port: Port, opt: typingsSlinky.jointjs.mod.dia.Cell.Options): this.type = js.native
  def addPorts(ports: js.Array[Port]): this.type = js.native
  def addPorts(ports: js.Array[Port], opt: typingsSlinky.jointjs.mod.dia.Cell.Options): this.type = js.native
  def fitEmbeds(): this.type = js.native
  def fitEmbeds(opt: typingsSlinky.jointjs.anon.Padding): this.type = js.native
  /* protected */ def generatePortId(): String | Double = js.native
  def getBBox(opt: EmbeddableOptions): Rect = js.native
  def getGroupPorts(groupName: String): js.Array[Port] = js.native
  def getPort(id: String): Port = js.native
  def getPortIndex(port: String): Double = js.native
  def getPortIndex(port: Port): Double = js.native
  def getPorts(): js.Array[Port] = js.native
  def getPortsPositions(groupName: String): StringDictionary[PortPosition] = js.native
  def hasPort(id: String): Boolean = js.native
  def hasPorts(): Boolean = js.native
  def portProp(portId: String, path: Path): js.Any = js.native
  def portProp(
    portId: String,
    path: Path,
    value: js.UndefOr[scala.Nothing],
    opt: typingsSlinky.jointjs.mod.dia.Cell.Options
  ): Element = js.native
  def portProp(portId: String, path: Path, value: js.Any): Element = js.native
  def portProp(portId: String, path: Path, value: js.Any, opt: typingsSlinky.jointjs.mod.dia.Cell.Options): Element = js.native
  @JSName("portProp")
  def portProp_Element(portId: String, path: Path): Element = js.native
  def position(): typingsSlinky.jointjs.mod.g.Point = js.native
  def position(opt: Dictkey): typingsSlinky.jointjs.mod.g.Point = js.native
  def position(x: Double, y: Double): this.type = js.native
  def position(x: Double, y: Double, opt: Deep): this.type = js.native
  def removePort(port: String): this.type = js.native
  def removePort(port: String, opt: typingsSlinky.jointjs.mod.dia.Cell.Options): this.type = js.native
  def removePort(port: Port): this.type = js.native
  def removePort(port: Port, opt: typingsSlinky.jointjs.mod.dia.Cell.Options): this.type = js.native
  def removePorts(): this.type = js.native
  def removePorts(opt: typingsSlinky.jointjs.mod.dia.Cell.Options): this.type = js.native
  def removePorts(ports: js.Array[Port | String]): this.type = js.native
  def removePorts(ports: js.Array[Port | String], opt: typingsSlinky.jointjs.mod.dia.Cell.Options): this.type = js.native
  def resize(width: Double, height: Double): this.type = js.native
  def resize(width: Double, height: Double, opt: typingsSlinky.jointjs.anon.Direction): this.type = js.native
  def rotate(deg: Double): this.type = js.native
  def rotate(
    deg: Double,
    absolute: js.UndefOr[scala.Nothing],
    origin: js.UndefOr[scala.Nothing],
    opt: StringDictionary[js.Any]
  ): this.type = js.native
  def rotate(deg: Double, absolute: js.UndefOr[scala.Nothing], origin: Point): this.type = js.native
  def rotate(deg: Double, absolute: js.UndefOr[scala.Nothing], origin: Point, opt: StringDictionary[js.Any]): this.type = js.native
  def rotate(deg: Double, absolute: Boolean): this.type = js.native
  def rotate(deg: Double, absolute: Boolean, origin: js.UndefOr[scala.Nothing], opt: StringDictionary[js.Any]): this.type = js.native
  def rotate(deg: Double, absolute: Boolean, origin: Point): this.type = js.native
  def rotate(deg: Double, absolute: Boolean, origin: Point, opt: StringDictionary[js.Any]): this.type = js.native
  def scale(scaleX: Double, scaleY: Double): this.type = js.native
  def scale(scaleX: Double, scaleY: Double, origin: js.UndefOr[scala.Nothing], opt: StringDictionary[js.Any]): this.type = js.native
  def scale(scaleX: Double, scaleY: Double, origin: Point): this.type = js.native
  def scale(scaleX: Double, scaleY: Double, origin: Point, opt: StringDictionary[js.Any]): this.type = js.native
  def size(): Size = js.native
  def size(width: Double): this.type = js.native
  def size(width: Double, height: js.UndefOr[scala.Nothing], opt: typingsSlinky.jointjs.anon.Direction): this.type = js.native
  def size(width: Double, height: Double): this.type = js.native
  def size(width: Double, height: Double, opt: typingsSlinky.jointjs.anon.Direction): this.type = js.native
  def translate(tx: Double): this.type = js.native
  def translate(tx: Double, ty: js.UndefOr[scala.Nothing], opt: TranslateOptions): this.type = js.native
  def translate(tx: Double, ty: Double): this.type = js.native
  def translate(tx: Double, ty: Double, opt: TranslateOptions): this.type = js.native
}

