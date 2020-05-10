package typingsSlinky.maxmind.readerMod

import typingsSlinky.maxmind.metadataMod.Metadata
import typingsSlinky.maxmind.responseMod.Response
import typingsSlinky.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Reader[T /* <: Response */] extends js.Object {
  var db: js.Any = js.native
  var decoder: js.Any = js.native
  var metadata: Metadata = js.native
  var walker: js.Any = js.native
  def findAddressInTree(ipAddress: String): Double | Null = js.native
  def get(ipAddress: String): T | Null = js.native
  def load(db: Buffer, opts: js.Object): Unit = js.native
  def resolveDataPointer(pointer: Double): js.Any = js.native
}

object Reader {
  @scala.inline
  def apply[T](
    db: js.Any,
    decoder: js.Any,
    findAddressInTree: String => Double | Null,
    get: String => T | Null,
    load: (Buffer, js.Object) => Unit,
    metadata: Metadata,
    resolveDataPointer: Double => js.Any,
    walker: js.Any
  ): Reader[T] = {
    val __obj = js.Dynamic.literal(db = db.asInstanceOf[js.Any], decoder = decoder.asInstanceOf[js.Any], findAddressInTree = js.Any.fromFunction1(findAddressInTree), get = js.Any.fromFunction1(get), load = js.Any.fromFunction2(load), metadata = metadata.asInstanceOf[js.Any], resolveDataPointer = js.Any.fromFunction1(resolveDataPointer), walker = walker.asInstanceOf[js.Any])
    __obj.asInstanceOf[Reader[T]]
  }
  @scala.inline
  implicit class ReaderOps[Self[t] <: Reader[t], T] (val x: Self[T]) extends AnyVal {
    @scala.inline
    def duplicate: Self[T] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[T]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[T] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[T] with Other]
    @scala.inline
    def withDb(value: js.Any): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("db")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDecoder(value: js.Any): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("decoder")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFindAddressInTree(value: String => Double | Null): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("findAddressInTree")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGet(value: String => T | Null): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("get")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withLoad(value: (Buffer, js.Object) => Unit): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("load")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withMetadata(value: Metadata): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("metadata")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withResolveDataPointer(value: Double => js.Any): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resolveDataPointer")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withWalker(value: js.Any): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("walker")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

