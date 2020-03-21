package typingsSlinky.grommet.components

import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.raw.SVGSVGElement
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.web.html.`*`.tag
import typingsSlinky.grommet.AnonAnchor
import typingsSlinky.grommet.diagramMod.DiagramProps
import typingsSlinky.react.mod.ClassAttributes
import typingsSlinky.react.mod.SVGAttributes
import typingsSlinky.react.mod.SVGProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Diagram
  extends ExternalComponentWithAttributesWithRefType[tag.type, js.Object] {
  @JSImport("grommet", "Diagram")
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  def apply(
    connections: js.Array[AnonAnchor],
    ClassAttributes: ClassAttributes[SVGSVGElement] = null,
    SVGAttributes: SVGAttributes[SVGSVGElement] = null,
    _overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[tag.type, js.Object] = {
    val __obj = js.Dynamic.literal(connections = connections.asInstanceOf[js.Any])
    if (ClassAttributes != null) js.Dynamic.global.Object.assign(__obj, ClassAttributes)
    if (SVGAttributes != null) js.Dynamic.global.Object.assign(__obj, SVGAttributes)
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  type Props = DiagramProps with SVGProps[SVGSVGElement]
}

