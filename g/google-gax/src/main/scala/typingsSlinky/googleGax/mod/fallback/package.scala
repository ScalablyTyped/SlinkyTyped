package typingsSlinky.googleGax.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object fallback {
  
  @scala.inline
  def constructSettings(
    serviceName: java.lang.String,
    clientConfig: typingsSlinky.googleGax.gaxMod.ClientConfig,
    configOverrides: typingsSlinky.googleGax.gaxMod.ClientConfig,
    retryNames: js.Object
  ): js.Any = (typingsSlinky.googleGax.mod.fallback.^.asInstanceOf[js.Dynamic].applyDynamic("constructSettings")(serviceName.asInstanceOf[js.Any], clientConfig.asInstanceOf[js.Any], configOverrides.asInstanceOf[js.Any], retryNames.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  @scala.inline
  def constructSettings(
    serviceName: java.lang.String,
    clientConfig: typingsSlinky.googleGax.gaxMod.ClientConfig,
    configOverrides: typingsSlinky.googleGax.gaxMod.ClientConfig,
    retryNames: js.Object,
    otherArgs: js.Object
  ): js.Any = (typingsSlinky.googleGax.mod.fallback.^.asInstanceOf[js.Dynamic].applyDynamic("constructSettings")(serviceName.asInstanceOf[js.Any], clientConfig.asInstanceOf[js.Any], configOverrides.asInstanceOf[js.Any], retryNames.asInstanceOf[js.Any], otherArgs.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  
  @scala.inline
  def createApiCall(
    func: js.Promise[typingsSlinky.googleGax.apitypesMod.GRPCCall],
    settings: typingsSlinky.googleGax.gaxMod.CallSettings
  ): typingsSlinky.googleGax.apitypesMod.GaxCall = (typingsSlinky.googleGax.mod.fallback.^.asInstanceOf[js.Dynamic].applyDynamic("createApiCall")(func.asInstanceOf[js.Any], settings.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.googleGax.apitypesMod.GaxCall]
  @scala.inline
  def createApiCall(
    func: js.Promise[typingsSlinky.googleGax.apitypesMod.GRPCCall],
    settings: typingsSlinky.googleGax.gaxMod.CallSettings,
    descriptor: typingsSlinky.googleGax.descriptorMod.Descriptor
  ): typingsSlinky.googleGax.apitypesMod.GaxCall = (typingsSlinky.googleGax.mod.fallback.^.asInstanceOf[js.Dynamic].applyDynamic("createApiCall")(func.asInstanceOf[js.Any], settings.asInstanceOf[js.Any], descriptor.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.googleGax.apitypesMod.GaxCall]
  @scala.inline
  def createApiCall(
    func: typingsSlinky.googleGax.apitypesMod.GRPCCall,
    settings: typingsSlinky.googleGax.gaxMod.CallSettings
  ): typingsSlinky.googleGax.apitypesMod.GaxCall = (typingsSlinky.googleGax.mod.fallback.^.asInstanceOf[js.Dynamic].applyDynamic("createApiCall")(func.asInstanceOf[js.Any], settings.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.googleGax.apitypesMod.GaxCall]
  @scala.inline
  def createApiCall(
    func: typingsSlinky.googleGax.apitypesMod.GRPCCall,
    settings: typingsSlinky.googleGax.gaxMod.CallSettings,
    descriptor: typingsSlinky.googleGax.descriptorMod.Descriptor
  ): typingsSlinky.googleGax.apitypesMod.GaxCall = (typingsSlinky.googleGax.mod.fallback.^.asInstanceOf[js.Dynamic].applyDynamic("createApiCall")(func.asInstanceOf[js.Any], settings.asInstanceOf[js.Any], descriptor.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.googleGax.apitypesMod.GaxCall]
  
  @scala.inline
  def fallback: js.Any = typingsSlinky.googleGax.mod.fallback.^.asInstanceOf[js.Dynamic].selectDynamic("fallback").asInstanceOf[js.Any]
  
  @scala.inline
  def lro(options: typingsSlinky.googleGax.grpcMod.GrpcClientOptions): typingsSlinky.googleGax.operationsClientMod.OperationsClientBuilder = typingsSlinky.googleGax.mod.fallback.^.asInstanceOf[js.Dynamic].applyDynamic("lro")(options.asInstanceOf[js.Any]).asInstanceOf[typingsSlinky.googleGax.operationsClientMod.OperationsClientBuilder]
  
  @scala.inline
  def version: java.lang.String = typingsSlinky.googleGax.mod.fallback.^.asInstanceOf[js.Dynamic].selectDynamic("version").asInstanceOf[java.lang.String]
}
