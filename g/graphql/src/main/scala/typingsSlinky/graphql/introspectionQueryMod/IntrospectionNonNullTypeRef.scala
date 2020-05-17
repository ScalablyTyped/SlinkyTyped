package typingsSlinky.graphql.introspectionQueryMod

import typingsSlinky.graphql.graphqlStrings.NON_NULL
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IntrospectionNonNullTypeRef[T /* <: IntrospectionTypeRef */]
  extends IntrospectionInputTypeRef
     with IntrospectionOutputTypeRef
     with IntrospectionTypeRef {
  val kind: NON_NULL = js.native
  val ofType: T = js.native
}

object IntrospectionNonNullTypeRef {
  @scala.inline
  def apply[T](kind: NON_NULL, ofType: T): IntrospectionNonNullTypeRef[T] = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], ofType = ofType.asInstanceOf[js.Any])
    __obj.asInstanceOf[IntrospectionNonNullTypeRef[T]]
  }
  @scala.inline
  implicit class IntrospectionNonNullTypeRefOps[Self[t] <: IntrospectionNonNullTypeRef[t], T] (val x: Self[T]) extends AnyVal {
    @scala.inline
    def duplicate: Self[T] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[T]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[T] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[T] with Other]
    @scala.inline
    def withKind(value: NON_NULL): Self[T] = {
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

