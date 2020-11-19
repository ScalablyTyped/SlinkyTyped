package typingsSlinky.apidevtoolsJsonSchemaRefParser.anon

import typingsSlinky.apidevtoolsJsonSchemaRefParser.mod.FileInfo
import typingsSlinky.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<@apidevtools/json-schema-ref-parser.@apidevtools/json-schema-ref-parser.ResolverOptions> */
@js.native
trait PartialResolverOptions extends js.Object {
  
  var canRead: js.UndefOr[
    Boolean | js.RegExp | String | js.Array[String] | (js.Function1[/* file */ FileInfo, Boolean])
  ] = js.native
  
  var order: js.UndefOr[Double] = js.native
  
  var read: js.UndefOr[
    js.Function2[
      /* file */ FileInfo, 
      /* callback */ js.UndefOr[js.Function2[/* error */ js.Error | Null, /* data */ String | Null, _]], 
      String | Buffer | (js.Promise[String | Buffer])
    ]
  ] = js.native
}
object PartialResolverOptions {
  
  @scala.inline
  def apply(): PartialResolverOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialResolverOptions]
  }
  
  @scala.inline
  implicit class PartialResolverOptionsOps[Self <: PartialResolverOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setCanReadVarargs(value: String*): Self = this.set("canRead", js.Array(value :_*))
    
    @scala.inline
    def setCanReadFunction1(value: /* file */ FileInfo => Boolean): Self = this.set("canRead", js.Any.fromFunction1(value))
    
    @scala.inline
    def setCanReadRegExp(value: js.RegExp): Self = this.set("canRead", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCanRead(
      value: Boolean | js.RegExp | String | js.Array[String] | (js.Function1[/* file */ FileInfo, Boolean])
    ): Self = this.set("canRead", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCanRead: Self = this.set("canRead", js.undefined)
    
    @scala.inline
    def setOrder(value: Double): Self = this.set("order", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOrder: Self = this.set("order", js.undefined)
    
    @scala.inline
    def setRead(
      value: (/* file */ FileInfo, /* callback */ js.UndefOr[js.Function2[/* error */ js.Error | Null, /* data */ String | Null, _]]) => String | Buffer | (js.Promise[String | Buffer])
    ): Self = this.set("read", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteRead: Self = this.set("read", js.undefined)
  }
}
