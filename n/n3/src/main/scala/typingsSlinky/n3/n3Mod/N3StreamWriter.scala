package typingsSlinky.n3.n3Mod

import typingsSlinky.node.NodeJS.ReadableStream
import typingsSlinky.node.NodeJS.WritableStream
import typingsSlinky.rdfDashJs.rdfDashJsMod.Sink
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait N3StreamWriter[Q /* <: typingsSlinky.rdfDashJs.rdfDashJsMod.BaseQuad */]
  extends ReadableStream
     with WritableStream
     with Sink[Q]

