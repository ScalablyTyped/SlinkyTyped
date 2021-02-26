package typingsSlinky.rdfjsFormatsCommon

import typingsSlinky.node.eventsMod.EventEmitter
import typingsSlinky.rdfJs.mod.Quad
import typingsSlinky.rdfJs.mod.Stream
import typingsSlinky.rdfjsSinkMap.mod.SinkMap
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@rdfjs/formats-common", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@rdfjs/formats-common", "parsers")
  @js.native
  def parsers: SinkMap[EventEmitter, Stream[Quad]] = js.native
  @scala.inline
  def parsers_=(x: SinkMap[EventEmitter, Stream[Quad]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("parsers")(x.asInstanceOf[js.Any])
  
  @JSImport("@rdfjs/formats-common", "serializers")
  @js.native
  def serializers: SinkMap[Stream[Quad], EventEmitter] = js.native
  @scala.inline
  def serializers_=(x: SinkMap[Stream[Quad], EventEmitter]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("serializers")(x.asInstanceOf[js.Any])
}
