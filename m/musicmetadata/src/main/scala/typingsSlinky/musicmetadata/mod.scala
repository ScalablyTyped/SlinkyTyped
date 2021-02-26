package typingsSlinky.musicmetadata

import typingsSlinky.musicmetadata.MM.Metadata
import typingsSlinky.musicmetadata.MM.Options
import typingsSlinky.node.eventsMod.EventEmitter
import typingsSlinky.node.streamMod.Readable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("musicmetadata", JSImport.Namespace)
  @js.native
  def apply(readStream: Readable, callback: js.Function2[/* err */ js.Error, /* metadata */ Metadata, Unit]): EventEmitter = js.native
  @JSImport("musicmetadata", JSImport.Namespace)
  @js.native
  def apply(
    readStream: Readable,
    options: Options,
    callback: js.Function2[/* err */ js.Error, /* metadata */ Metadata, Unit]
  ): EventEmitter = js.native
}
