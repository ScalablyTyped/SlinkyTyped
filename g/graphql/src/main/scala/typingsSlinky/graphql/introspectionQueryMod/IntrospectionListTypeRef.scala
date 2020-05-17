package typingsSlinky.graphql.introspectionQueryMod

import typingsSlinky.graphql.graphqlStrings.LIST
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IntrospectionListTypeRef[T /* <: IntrospectionTypeRef */]
  extends IntrospectionInputTypeRef
     with IntrospectionOutputTypeRef
     with IntrospectionTypeRef {
  val kind: LIST = js.native
  val ofType: T = js.native
}

object IntrospectionListTypeRef {
  @scala.inline
  def apply[T](kind: LIST, ofType: T): IntrospectionListTypeRef[T] = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], ofType = ofType.asInstanceOf[js.Any])
    __obj.asInstanceOf[IntrospectionListTypeRef[T]]
  }
  @scala.inline
  implicit class IntrospectionListTypeRefOps[Self[t] <: IntrospectionListTypeRef[t], T] (val x: Self[T]) extends AnyVal {
    @scala.inline
    def duplicate: Self[T] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[T]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[T] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[T] with Other]
    @scala.inline
    def withKind(value: LIST): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("kind")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOfType(value: T): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ofType")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

