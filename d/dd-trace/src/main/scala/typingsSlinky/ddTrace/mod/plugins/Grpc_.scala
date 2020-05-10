package typingsSlinky.ddTrace.mod.plugins

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.ddTrace.mod.Analyzable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** @hidden */
@js.native
trait Grpc_
  extends Integration
     with Analyzable {
  /**
    * An array of metadata entries to record. Can also be a callback that returns
    * the key/value pairs to record. For example, using
    * `variables => variables` would record all variables.
    */
  var metadata: js.UndefOr[
    js.Array[String] | (js.Function1[/* variables */ StringDictionary[js.Any], StringDictionary[_]])
  ] = js.native
}

object Grpc_ {
  @scala.inline
  def apply(): Grpc_ = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Grpc_]
  }
  @scala.inline
  implicit class Grpc_Ops[Self <: Grpc_] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMetadataFunction1(value: /* variables */ StringDictionary[js.Any] => StringDictionary[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("metadata")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withMetadata(
      value: js.Array[String] | (js.Function1[/* variables */ StringDictionary[js.Any], StringDictionary[_]])
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("metadata")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMetadata: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("metadata")(js.undefined)
        ret
    }
  }
  
}

