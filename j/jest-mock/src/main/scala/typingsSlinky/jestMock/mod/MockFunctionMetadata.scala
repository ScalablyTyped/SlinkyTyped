package typingsSlinky.jestMock.mod

import typingsSlinky.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MockFunctionMetadata[T, Y /* <: js.Array[_] */, Type] extends js.Object {
  var length: js.UndefOr[Double] = js.native
  var members: js.UndefOr[Record[String, MockFunctionMetadata[T, Y, MockFunctionMetadataType]]] = js.native
  var mockImpl: js.UndefOr[js.Function1[/* args */ Y, T]] = js.native
  var name: js.UndefOr[String] = js.native
  var ref: js.UndefOr[Double] = js.native
  var refID: js.UndefOr[Double] = js.native
  var `type`: js.UndefOr[Type] = js.native
  var value: js.UndefOr[T] = js.native
}

object MockFunctionMetadata {
  @scala.inline
  def apply[T, Y, Type](): MockFunctionMetadata[T, Y, Type] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MockFunctionMetadata[T, Y, Type]]
  }
  @scala.inline
  implicit class MockFunctionMetadataOps[Self[t, y, `type`] <: MockFunctionMetadata[t, y, `type`], T, Y, Type] (val x: Self[T, Y, Type]) extends AnyVal {
    @scala.inline
    def duplicate: Self[T, Y, Type] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[T, Y, Type]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): (Self[T, Y, Type]) with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[(Self[T, Y, Type]) with Other]
    @scala.inline
    def withLength(value: Double): Self[T, Y, Type] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("length")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLength: Self[T, Y, Type] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("length")(js.undefined)
        ret
    }
    @scala.inline
    def withMembers(value: Record[String, MockFunctionMetadata[T, Y, MockFunctionMetadataType]]): Self[T, Y, Type] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("members")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMembers: Self[T, Y, Type] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("members")(js.undefined)
        ret
    }
    @scala.inline
    def withMockImpl(value: /* args */ Y => T): Self[T, Y, Type] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mockImpl")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutMockImpl: Self[T, Y, Type] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mockImpl")(js.undefined)
        ret
    }
    @scala.inline
    def withName(value: String): Self[T, Y, Type] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutName: Self[T, Y, Type] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(js.undefined)
        ret
    }
    @scala.inline
    def withRef(value: Double): Self[T, Y, Type] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ref")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRef: Self[T, Y, Type] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ref")(js.undefined)
        ret
    }
    @scala.inline
    def withRefID(value: Double): Self[T, Y, Type] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("refID")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRefID: Self[T, Y, Type] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("refID")(js.undefined)
        ret
    }
    @scala.inline
    def withType(value: Type): Self[T, Y, Type] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutType: Self[T, Y, Type] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(js.undefined)
        ret
    }
    @scala.inline
    def withValue(value: T): Self[T, Y, Type] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("value")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutValue: Self[T, Y, Type] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("value")(js.undefined)
        ret
    }
  }
  
}

