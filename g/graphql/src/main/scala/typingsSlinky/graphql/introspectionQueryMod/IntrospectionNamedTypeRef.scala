package typingsSlinky.graphql.introspectionQueryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IntrospectionNamedTypeRef[T /* <: IntrospectionType */]
  extends IntrospectionInputTypeRef
     with IntrospectionOutputTypeRef
     with IntrospectionTypeRef {
  val kind: /* import warning: importer.ImportType#apply Failed type conversion: T['kind'] */ js.Any = js.native
  val name: String = js.native
}

object IntrospectionNamedTypeRef {
  @scala.inline
  def apply[T](
    kind: /* import warning: importer.ImportType#apply Failed type conversion: T['kind'] */ js.Any,
    name: String
  ): IntrospectionNamedTypeRef[T] = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[IntrospectionNamedTypeRef[T]]
  }
  @scala.inline
  implicit class IntrospectionNamedTypeRefOps[Self[t] <: IntrospectionNamedTypeRef[t], T] (val x: Self[T]) extends AnyVal {
    @scala.inline
    def duplicate: Self[T] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[T]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[T] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[T] with Other]
    @scala.inline
    def withKind(value: /* import warning: importer.ImportType#apply Failed type conversion: T['kind'] */ js.Any): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("kind")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withName(value: String): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

