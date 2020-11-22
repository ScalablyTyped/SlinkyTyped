package typingsSlinky.cors.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CorsOptions extends js.Object {
  
  var allowedHeaders: js.UndefOr[String | js.Array[String]] = js.native
  
  var credentials: js.UndefOr[Boolean] = js.native
  
  var exposedHeaders: js.UndefOr[String | js.Array[String]] = js.native
  
  var maxAge: js.UndefOr[Double] = js.native
  
  /**
    * @default 'GET,HEAD,PUT,PATCH,POST,DELETE'
    */
  var methods: js.UndefOr[String | js.Array[String]] = js.native
  
  /**
    * @default 204
    */
  var optionsSuccessStatus: js.UndefOr[Double] = js.native
  
  /**
    * @default '*''
    */
  var origin: js.UndefOr[Boolean | String | js.RegExp | (js.Array[String | js.RegExp]) | CustomOrigin] = js.native
  
  /**
    * @default false
    */
  var preflightContinue: js.UndefOr[Boolean] = js.native
}
object CorsOptions {
  
  @scala.inline
  def apply(): CorsOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CorsOptions]
  }
  
  @scala.inline
  implicit class CorsOptionsOps[Self <: CorsOptions] (val x: Self) extends AnyVal {
    
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
    def setAllowedHeadersVarargs(value: String*): Self = this.set("allowedHeaders", js.Array(value :_*))
    
    @scala.inline
    def setAllowedHeaders(value: String | js.Array[String]): Self = this.set("allowedHeaders", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAllowedHeaders: Self = this.set("allowedHeaders", js.undefined)
    
    @scala.inline
    def setCredentials(value: Boolean): Self = this.set("credentials", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCredentials: Self = this.set("credentials", js.undefined)
    
    @scala.inline
    def setExposedHeadersVarargs(value: String*): Self = this.set("exposedHeaders", js.Array(value :_*))
    
    @scala.inline
    def setExposedHeaders(value: String | js.Array[String]): Self = this.set("exposedHeaders", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExposedHeaders: Self = this.set("exposedHeaders", js.undefined)
    
    @scala.inline
    def setMaxAge(value: Double): Self = this.set("maxAge", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxAge: Self = this.set("maxAge", js.undefined)
    
    @scala.inline
    def setMethodsVarargs(value: String*): Self = this.set("methods", js.Array(value :_*))
    
    @scala.inline
    def setMethods(value: String | js.Array[String]): Self = this.set("methods", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMethods: Self = this.set("methods", js.undefined)
    
    @scala.inline
    def setOptionsSuccessStatus(value: Double): Self = this.set("optionsSuccessStatus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOptionsSuccessStatus: Self = this.set("optionsSuccessStatus", js.undefined)
    
    @scala.inline
    def setOriginFunction2(
      value: (/* requestOrigin */ js.UndefOr[String], /* callback */ js.Function2[/* err */ js.Error | Null, /* allow */ js.UndefOr[Boolean], Unit]) => Unit
    ): Self = this.set("origin", js.Any.fromFunction2(value))
    
    @scala.inline
    def setOriginVarargs(value: (String | js.RegExp)*): Self = this.set("origin", js.Array(value :_*))
    
    @scala.inline
    def setOriginRegExp(value: js.RegExp): Self = this.set("origin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOrigin(value: Boolean | String | js.RegExp | (js.Array[String | js.RegExp]) | CustomOrigin): Self = this.set("origin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOrigin: Self = this.set("origin", js.undefined)
    
    @scala.inline
    def setPreflightContinue(value: Boolean): Self = this.set("preflightContinue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePreflightContinue: Self = this.set("preflightContinue", js.undefined)
  }
}
