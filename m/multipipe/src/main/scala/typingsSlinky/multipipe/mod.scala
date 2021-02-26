package typingsSlinky.multipipe

import typingsSlinky.node.streamMod.Duplex
import typingsSlinky.node.streamMod.DuplexOptions
import typingsSlinky.node.streamMod.PassThrough
import typingsSlinky.node.streamMod.Readable
import typingsSlinky.node.streamMod.Stream
import typingsSlinky.node.streamMod.Writable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  /**
    * Pass a variable number of streams and each will be piped to the next one.
    *
    * A stream will be returned that wraps passed in streams in a way that errors will be forwarded and you can write to and/or read from it.
    *
    * Pass an object as the second to last or last argument to pass as options to the underlying stream constructors.
    *
    * Pass a function as last argument to be called on error or finish of the last stream.
    */
  @JSImport("multipipe", JSImport.Namespace)
  @js.native
  def apply(): PassThrough = js.native
  @JSImport("multipipe", JSImport.Namespace)
  @js.native
  def apply(callback: js.Function1[/* err */ js.UndefOr[js.Error], _]): PassThrough = js.native
  @JSImport("multipipe", JSImport.Namespace)
  @js.native
  def apply(options: js.UndefOr[scala.Nothing], callback: js.Function1[/* err */ js.UndefOr[js.Error], _]): PassThrough = js.native
  @JSImport("multipipe", JSImport.Namespace)
  @js.native
  def apply(options: DuplexOptions): PassThrough = js.native
  @JSImport("multipipe", JSImport.Namespace)
  @js.native
  def apply(options: DuplexOptions, callback: js.Function1[/* err */ js.UndefOr[js.Error], _]): PassThrough = js.native
  @JSImport("multipipe", JSImport.Namespace)
  @js.native
  def apply(source: Readable, destination: Writable): Duplex = js.native
  @JSImport("multipipe", JSImport.Namespace)
  @js.native
  def apply(source: Readable, destination: Writable, callback: js.Function1[/* err */ js.UndefOr[js.Error], _]): Duplex = js.native
  @JSImport("multipipe", JSImport.Namespace)
  @js.native
  def apply(
    source: Readable,
    destination: Writable,
    options: js.UndefOr[scala.Nothing],
    callback: js.Function1[/* err */ js.UndefOr[js.Error], _]
  ): Duplex = js.native
  @JSImport("multipipe", JSImport.Namespace)
  @js.native
  def apply(source: Readable, destination: Writable, options: DuplexOptions): Duplex = js.native
  @JSImport("multipipe", JSImport.Namespace)
  @js.native
  def apply(
    source: Readable,
    destination: Writable,
    options: DuplexOptions,
    callback: js.Function1[/* err */ js.UndefOr[js.Error], _]
  ): Duplex = js.native
  @JSImport("multipipe", JSImport.Namespace)
  @js.native
  def apply(source: Readable, t1: Duplex, t2: Duplex, destination: Writable): Duplex = js.native
  @JSImport("multipipe", JSImport.Namespace)
  @js.native
  def apply(
    source: Readable,
    t1: Duplex,
    t2: Duplex,
    destination: Writable,
    callback: js.Function1[/* err */ js.UndefOr[js.Error], _]
  ): Duplex = js.native
  @JSImport("multipipe", JSImport.Namespace)
  @js.native
  def apply(source: Readable, t1: Duplex, t2: Duplex, destination: Writable, options: DuplexOptions): Duplex = js.native
  @JSImport("multipipe", JSImport.Namespace)
  @js.native
  def apply(
    source: Readable,
    t1: Duplex,
    t2: Duplex,
    destination: Writable,
    options: DuplexOptions,
    callback: js.Function1[/* err */ js.UndefOr[js.Error], _]
  ): Duplex = js.native
  @JSImport("multipipe", JSImport.Namespace)
  @js.native
  def apply(source: Readable, t1: Duplex, t2: Duplex, t3: Duplex, destination: Writable): Duplex = js.native
  @JSImport("multipipe", JSImport.Namespace)
  @js.native
  def apply(
    source: Readable,
    t1: Duplex,
    t2: Duplex,
    t3: Duplex,
    destination: Writable,
    callback: js.Function1[/* err */ js.UndefOr[js.Error], _]
  ): Duplex = js.native
  @JSImport("multipipe", JSImport.Namespace)
  @js.native
  def apply(
    source: Readable,
    t1: Duplex,
    t2: Duplex,
    t3: Duplex,
    destination: Writable,
    options: DuplexOptions
  ): Duplex = js.native
  @JSImport("multipipe", JSImport.Namespace)
  @js.native
  def apply(
    source: Readable,
    t1: Duplex,
    t2: Duplex,
    t3: Duplex,
    destination: Writable,
    options: DuplexOptions,
    callback: js.Function1[/* err */ js.UndefOr[js.Error], _]
  ): Duplex = js.native
  @JSImport("multipipe", JSImport.Namespace)
  @js.native
  def apply(source: Readable, t1: Duplex, t2: Duplex, t3: Duplex, t4: Duplex, destination: Writable): Duplex = js.native
  @JSImport("multipipe", JSImport.Namespace)
  @js.native
  def apply(
    source: Readable,
    t1: Duplex,
    t2: Duplex,
    t3: Duplex,
    t4: Duplex,
    destination: Writable,
    callback: js.Function1[/* err */ js.UndefOr[js.Error], _]
  ): Duplex = js.native
  @JSImport("multipipe", JSImport.Namespace)
  @js.native
  def apply(
    source: Readable,
    t1: Duplex,
    t2: Duplex,
    t3: Duplex,
    t4: Duplex,
    destination: Writable,
    options: DuplexOptions
  ): Duplex = js.native
  @JSImport("multipipe", JSImport.Namespace)
  @js.native
  def apply(
    source: Readable,
    t1: Duplex,
    t2: Duplex,
    t3: Duplex,
    t4: Duplex,
    destination: Writable,
    options: DuplexOptions,
    callback: js.Function1[/* err */ js.UndefOr[js.Error], _]
  ): Duplex = js.native
  @JSImport("multipipe", JSImport.Namespace)
  @js.native
  def apply(
    source: Readable,
    t1: Duplex,
    t2: Duplex,
    t3: Duplex,
    t4: Duplex,
    t5: Duplex,
    destination: Writable
  ): Duplex = js.native
  @JSImport("multipipe", JSImport.Namespace)
  @js.native
  def apply(
    source: Readable,
    t1: Duplex,
    t2: Duplex,
    t3: Duplex,
    t4: Duplex,
    t5: Duplex,
    destination: Writable,
    callback: js.Function1[/* err */ js.UndefOr[js.Error], _]
  ): Duplex = js.native
  @JSImport("multipipe", JSImport.Namespace)
  @js.native
  def apply(
    source: Readable,
    t1: Duplex,
    t2: Duplex,
    t3: Duplex,
    t4: Duplex,
    t5: Duplex,
    destination: Writable,
    options: DuplexOptions
  ): Duplex = js.native
  @JSImport("multipipe", JSImport.Namespace)
  @js.native
  def apply(
    source: Readable,
    t1: Duplex,
    t2: Duplex,
    t3: Duplex,
    t4: Duplex,
    t5: Duplex,
    destination: Writable,
    options: DuplexOptions,
    callback: js.Function1[/* err */ js.UndefOr[js.Error], _]
  ): Duplex = js.native
  @JSImport("multipipe", JSImport.Namespace)
  @js.native
  def apply(
    source: Readable,
    t1: Duplex,
    t2: Duplex,
    t3: Duplex,
    t4: Duplex,
    t5: Duplex,
    t6: Duplex,
    destination: Writable
  ): Duplex = js.native
  @JSImport("multipipe", JSImport.Namespace)
  @js.native
  def apply(
    source: Readable,
    t1: Duplex,
    t2: Duplex,
    t3: Duplex,
    t4: Duplex,
    t5: Duplex,
    t6: Duplex,
    destination: Writable,
    callback: js.Function1[/* err */ js.UndefOr[js.Error], _]
  ): Duplex = js.native
  @JSImport("multipipe", JSImport.Namespace)
  @js.native
  def apply(
    source: Readable,
    t1: Duplex,
    t2: Duplex,
    t3: Duplex,
    t4: Duplex,
    t5: Duplex,
    t6: Duplex,
    destination: Writable,
    options: DuplexOptions
  ): Duplex = js.native
  @JSImport("multipipe", JSImport.Namespace)
  @js.native
  def apply(
    source: Readable,
    t1: Duplex,
    t2: Duplex,
    t3: Duplex,
    t4: Duplex,
    t5: Duplex,
    t6: Duplex,
    destination: Writable,
    options: DuplexOptions,
    callback: js.Function1[/* err */ js.UndefOr[js.Error], _]
  ): Duplex = js.native
  @JSImport("multipipe", JSImport.Namespace)
  @js.native
  def apply(
    source: Readable,
    t1: Duplex,
    t2: Duplex,
    t3: Duplex,
    t4: Duplex,
    t5: Duplex,
    t6: Duplex,
    t7: Duplex,
    destination: Writable
  ): Duplex = js.native
  @JSImport("multipipe", JSImport.Namespace)
  @js.native
  def apply(
    source: Readable,
    t1: Duplex,
    t2: Duplex,
    t3: Duplex,
    t4: Duplex,
    t5: Duplex,
    t6: Duplex,
    t7: Duplex,
    destination: Writable,
    callback: js.Function1[/* err */ js.UndefOr[js.Error], _]
  ): Duplex = js.native
  @JSImport("multipipe", JSImport.Namespace)
  @js.native
  def apply(
    source: Readable,
    t1: Duplex,
    t2: Duplex,
    t3: Duplex,
    t4: Duplex,
    t5: Duplex,
    t6: Duplex,
    t7: Duplex,
    destination: Writable,
    options: DuplexOptions
  ): Duplex = js.native
  @JSImport("multipipe", JSImport.Namespace)
  @js.native
  def apply(
    source: Readable,
    t1: Duplex,
    t2: Duplex,
    t3: Duplex,
    t4: Duplex,
    t5: Duplex,
    t6: Duplex,
    t7: Duplex,
    destination: Writable,
    options: DuplexOptions,
    callback: js.Function1[/* err */ js.UndefOr[js.Error], _]
  ): Duplex = js.native
  @JSImport("multipipe", JSImport.Namespace)
  @js.native
  def apply(source: Readable, transform: Duplex, destination: Writable): Duplex = js.native
  @JSImport("multipipe", JSImport.Namespace)
  @js.native
  def apply(
    source: Readable,
    transform: Duplex,
    destination: Writable,
    callback: js.Function1[/* err */ js.UndefOr[js.Error], _]
  ): Duplex = js.native
  @JSImport("multipipe", JSImport.Namespace)
  @js.native
  def apply(source: Readable, transform: Duplex, destination: Writable, options: DuplexOptions): Duplex = js.native
  @JSImport("multipipe", JSImport.Namespace)
  @js.native
  def apply(
    source: Readable,
    transform: Duplex,
    destination: Writable,
    options: DuplexOptions,
    callback: js.Function1[/* err */ js.UndefOr[js.Error], _]
  ): Duplex = js.native
  @JSImport("multipipe", JSImport.Namespace)
  @js.native
  def apply(stream: js.Array[Stream]): Duplex = js.native
  @JSImport("multipipe", JSImport.Namespace)
  @js.native
  def apply(stream: js.Array[Stream], callback: js.Function1[/* err */ js.UndefOr[js.Error], _]): Duplex = js.native
  @JSImport("multipipe", JSImport.Namespace)
  @js.native
  def apply(
    stream: js.Array[Stream],
    options: js.UndefOr[scala.Nothing],
    callback: js.Function1[/* err */ js.UndefOr[js.Error], _]
  ): Duplex = js.native
  @JSImport("multipipe", JSImport.Namespace)
  @js.native
  def apply(stream: js.Array[Stream], options: DuplexOptions): Duplex = js.native
  @JSImport("multipipe", JSImport.Namespace)
  @js.native
  def apply(
    stream: js.Array[Stream],
    options: DuplexOptions,
    callback: js.Function1[/* err */ js.UndefOr[js.Error], _]
  ): Duplex = js.native
  @JSImport("multipipe", JSImport.Namespace)
  @js.native
  def apply(stream: Duplex): Duplex = js.native
  @JSImport("multipipe", JSImport.Namespace)
  @js.native
  def apply(stream: Duplex, callback: js.Function1[/* err */ js.UndefOr[js.Error], _]): Duplex = js.native
  @JSImport("multipipe", JSImport.Namespace)
  @js.native
  def apply(
    stream: Duplex,
    options: js.UndefOr[scala.Nothing],
    callback: js.Function1[/* err */ js.UndefOr[js.Error], _]
  ): Duplex = js.native
  @JSImport("multipipe", JSImport.Namespace)
  @js.native
  def apply(stream: Duplex, options: DuplexOptions): Duplex = js.native
  @JSImport("multipipe", JSImport.Namespace)
  @js.native
  def apply(stream: Duplex, options: DuplexOptions, callback: js.Function1[/* err */ js.UndefOr[js.Error], _]): Duplex = js.native
}
