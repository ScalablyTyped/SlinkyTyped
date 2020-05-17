package typingsSlinky.jointjs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object anchors {
  type Anchor = typingsSlinky.jointjs.mod.anchors.GenericAnchor[typingsSlinky.jointjs.mod.anchors.AnchorType]
  type AnchorJSON = typingsSlinky.jointjs.mod.anchors.GenericAnchorJSON[typingsSlinky.jointjs.mod.anchors.AnchorType]
  type GenericAnchor[K /* <: typingsSlinky.jointjs.mod.anchors.AnchorType */] = js.Function4[
    /* endView */ typingsSlinky.jointjs.mod.dia.CellView, 
    /* endMagnet */ org.scalajs.dom.raw.SVGElement, 
    /* anchorReference */ typingsSlinky.jointjs.mod.g.Point | org.scalajs.dom.raw.SVGElement, 
    /* import warning: importer.ImportType#apply Failed type conversion: jointjs.jointjs.anchors.AnchorArgumentsMap[K] */ /* opt */ js.Any, 
    typingsSlinky.jointjs.mod.g.Point
  ]
  type GenericAnchorArguments[K /* <: typingsSlinky.jointjs.mod.anchors.AnchorType */] = /* import warning: importer.ImportType#apply Failed type conversion: jointjs.jointjs.anchors.AnchorArgumentsMap[K] */ js.Any
}
