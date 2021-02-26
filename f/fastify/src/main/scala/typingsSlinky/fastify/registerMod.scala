package typingsSlinky.fastify

import typingsSlinky.fastify.anon.Default
import typingsSlinky.fastify.anon.DefaultFastifyPluginAsync
import typingsSlinky.fastify.loggerMod.LogLevel
import typingsSlinky.fastify.pluginMod.FastifyPluginAsync
import typingsSlinky.fastify.pluginMod.FastifyPluginCallback
import typingsSlinky.fastify.pluginMod.FastifyPluginOptions
import typingsSlinky.fastify.utilsMod.RawServerDefault
import typingsSlinky.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object registerMod {
  
  @js.native
  trait FastifyRegister[T] extends StObject {
    
    def apply[Options /* <: FastifyPluginOptions */](plugin: js.Promise[Default[Options] | DefaultFastifyPluginAsync[Options]]): T = js.native
    def apply[Options /* <: FastifyPluginOptions */](
      plugin: js.Promise[Default[Options] | DefaultFastifyPluginAsync[Options]],
      opts: FastifyRegisterOptions[Options]
    ): T = js.native
    def apply[Options /* <: FastifyPluginOptions */](plugin: FastifyPluginAsync[Options, RawServerDefault]): T = js.native
    def apply[Options /* <: FastifyPluginOptions */](plugin: FastifyPluginAsync[Options, RawServerDefault], opts: FastifyRegisterOptions[Options]): T = js.native
    def apply[Options /* <: FastifyPluginOptions */](plugin: FastifyPluginCallback[Options, RawServerDefault]): T = js.native
    def apply[Options /* <: FastifyPluginOptions */](plugin: FastifyPluginCallback[Options, RawServerDefault], opts: FastifyRegisterOptions[Options]): T = js.native
  }
  
  type FastifyRegisterOptions[Options] = (RegisterOptions with Options) | (js.Function0[RegisterOptions with Options])
  
  @js.native
  trait RegisterOptions extends StObject {
    
    var logLevel: js.UndefOr[LogLevel] = js.native
    
    var logSerializers: js.UndefOr[Record[String, js.Function1[/* value */ _, String]]] = js.native
    
    var prefix: js.UndefOr[String] = js.native
  }
  object RegisterOptions {
    
    @scala.inline
    def apply(): RegisterOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[RegisterOptions]
    }
    
    @scala.inline
    implicit class RegisterOptionsMutableBuilder[Self <: RegisterOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setLogLevel(value: LogLevel): Self = StObject.set(x, "logLevel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLogLevelUndefined: Self = StObject.set(x, "logLevel", js.undefined)
      
      @scala.inline
      def setLogSerializers(value: Record[String, js.Function1[/* value */ _, String]]): Self = StObject.set(x, "logSerializers", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLogSerializersUndefined: Self = StObject.set(x, "logSerializers", js.undefined)
      
      @scala.inline
      def setPrefix(value: String): Self = StObject.set(x, "prefix", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrefixUndefined: Self = StObject.set(x, "prefix", js.undefined)
    }
  }
}
