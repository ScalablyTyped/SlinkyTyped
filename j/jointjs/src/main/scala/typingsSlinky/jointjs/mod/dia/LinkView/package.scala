package typingsSlinky.jointjs.mod.dia

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object LinkView {
  type GetConnectionPoint = js.Function5[
    /* linkView */ typingsSlinky.jointjs.mod.dia.LinkView, 
    /* view */ typingsSlinky.jointjs.mod.dia.ElementView, 
    /* magnet */ org.scalajs.dom.raw.SVGElement, 
    /* reference */ typingsSlinky.jointjs.mod.dia.Point, 
    /* end */ typingsSlinky.jointjs.mod.dia.LinkEnd, 
    typingsSlinky.jointjs.mod.dia.Point
  ]
  type VertexOptions = typingsSlinky.jointjs.mod.dia.Cell.Options
}
