package typingsSlinky.googleGax

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  @scala.inline
  def constructSettings(
    serviceName: java.lang.String,
    clientConfig: typingsSlinky.googleGax.gaxMod.ClientConfig,
    configOverrides: typingsSlinky.googleGax.gaxMod.ClientConfig,
    retryNames: js.Object
  ): js.Any = (typingsSlinky.googleGax.mod.^.asInstanceOf[js.Dynamic].applyDynamic("constructSettings")(serviceName.asInstanceOf[js.Any], clientConfig.asInstanceOf[js.Any], configOverrides.asInstanceOf[js.Any], retryNames.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  @scala.inline
  def constructSettings(
    serviceName: java.lang.String,
    clientConfig: typingsSlinky.googleGax.gaxMod.ClientConfig,
    configOverrides: typingsSlinky.googleGax.gaxMod.ClientConfig,
    retryNames: js.Object,
    otherArgs: js.Object
  ): js.Any = (typingsSlinky.googleGax.mod.^.asInstanceOf[js.Dynamic].applyDynamic("constructSettings")(serviceName.asInstanceOf[js.Any], clientConfig.asInstanceOf[js.Any], configOverrides.asInstanceOf[js.Any], retryNames.asInstanceOf[js.Any], otherArgs.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  
  @scala.inline
  def createApiCall(
    func: js.Promise[typingsSlinky.googleGax.apitypesMod.GRPCCall],
    settings: typingsSlinky.googleGax.gaxMod.CallSettings
  ): typingsSlinky.googleGax.apitypesMod.GaxCall = (typingsSlinky.googleGax.mod.^.asInstanceOf[js.Dynamic].applyDynamic("createApiCall")(func.asInstanceOf[js.Any], settings.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.googleGax.apitypesMod.GaxCall]
  @scala.inline
  def createApiCall(
    func: js.Promise[typingsSlinky.googleGax.apitypesMod.GRPCCall],
    settings: typingsSlinky.googleGax.gaxMod.CallSettings,
    descriptor: typingsSlinky.googleGax.descriptorMod.Descriptor
  ): typingsSlinky.googleGax.apitypesMod.GaxCall = (typingsSlinky.googleGax.mod.^.asInstanceOf[js.Dynamic].applyDynamic("createApiCall")(func.asInstanceOf[js.Any], settings.asInstanceOf[js.Any], descriptor.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.googleGax.apitypesMod.GaxCall]
  @scala.inline
  def createApiCall(
    func: typingsSlinky.googleGax.apitypesMod.GRPCCall,
    settings: typingsSlinky.googleGax.gaxMod.CallSettings
  ): typingsSlinky.googleGax.apitypesMod.GaxCall = (typingsSlinky.googleGax.mod.^.asInstanceOf[js.Dynamic].applyDynamic("createApiCall")(func.asInstanceOf[js.Any], settings.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.googleGax.apitypesMod.GaxCall]
  @scala.inline
  def createApiCall(
    func: typingsSlinky.googleGax.apitypesMod.GRPCCall,
    settings: typingsSlinky.googleGax.gaxMod.CallSettings,
    descriptor: typingsSlinky.googleGax.descriptorMod.Descriptor
  ): typingsSlinky.googleGax.apitypesMod.GaxCall = (typingsSlinky.googleGax.mod.^.asInstanceOf[js.Dynamic].applyDynamic("createApiCall")(func.asInstanceOf[js.Any], settings.asInstanceOf[js.Any], descriptor.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.googleGax.apitypesMod.GaxCall]
  
  @scala.inline
  def createBackoffSettings(
    initialRetryDelayMillis: scala.Double,
    retryDelayMultiplier: scala.Double,
    maxRetryDelayMillis: scala.Double
  ): typingsSlinky.googleGax.gaxMod.BackoffSettings = (typingsSlinky.googleGax.mod.^.asInstanceOf[js.Dynamic].applyDynamic("createBackoffSettings")(initialRetryDelayMillis.asInstanceOf[js.Any], retryDelayMultiplier.asInstanceOf[js.Any], maxRetryDelayMillis.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.googleGax.gaxMod.BackoffSettings]
  @scala.inline
  def createBackoffSettings(
    initialRetryDelayMillis: scala.Double,
    retryDelayMultiplier: scala.Double,
    maxRetryDelayMillis: scala.Double,
    initialRpcTimeoutMillis: scala.Double
  ): typingsSlinky.googleGax.gaxMod.BackoffSettings = (typingsSlinky.googleGax.mod.^.asInstanceOf[js.Dynamic].applyDynamic("createBackoffSettings")(initialRetryDelayMillis.asInstanceOf[js.Any], retryDelayMultiplier.asInstanceOf[js.Any], maxRetryDelayMillis.asInstanceOf[js.Any], initialRpcTimeoutMillis.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.googleGax.gaxMod.BackoffSettings]
  @scala.inline
  def createBackoffSettings(
    initialRetryDelayMillis: scala.Double,
    retryDelayMultiplier: scala.Double,
    maxRetryDelayMillis: scala.Double,
    initialRpcTimeoutMillis: scala.Double,
    rpcTimeoutMultiplier: scala.Double
  ): typingsSlinky.googleGax.gaxMod.BackoffSettings = (typingsSlinky.googleGax.mod.^.asInstanceOf[js.Dynamic].applyDynamic("createBackoffSettings")(initialRetryDelayMillis.asInstanceOf[js.Any], retryDelayMultiplier.asInstanceOf[js.Any], maxRetryDelayMillis.asInstanceOf[js.Any], initialRpcTimeoutMillis.asInstanceOf[js.Any], rpcTimeoutMultiplier.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.googleGax.gaxMod.BackoffSettings]
  @scala.inline
  def createBackoffSettings(
    initialRetryDelayMillis: scala.Double,
    retryDelayMultiplier: scala.Double,
    maxRetryDelayMillis: scala.Double,
    initialRpcTimeoutMillis: scala.Double,
    rpcTimeoutMultiplier: scala.Double,
    maxRpcTimeoutMillis: scala.Double
  ): typingsSlinky.googleGax.gaxMod.BackoffSettings = (typingsSlinky.googleGax.mod.^.asInstanceOf[js.Dynamic].applyDynamic("createBackoffSettings")(initialRetryDelayMillis.asInstanceOf[js.Any], retryDelayMultiplier.asInstanceOf[js.Any], maxRetryDelayMillis.asInstanceOf[js.Any], initialRpcTimeoutMillis.asInstanceOf[js.Any], rpcTimeoutMultiplier.asInstanceOf[js.Any], maxRpcTimeoutMillis.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.googleGax.gaxMod.BackoffSettings]
  @scala.inline
  def createBackoffSettings(
    initialRetryDelayMillis: scala.Double,
    retryDelayMultiplier: scala.Double,
    maxRetryDelayMillis: scala.Double,
    initialRpcTimeoutMillis: scala.Double,
    rpcTimeoutMultiplier: scala.Double,
    maxRpcTimeoutMillis: scala.Double,
    totalTimeoutMillis: scala.Double
  ): typingsSlinky.googleGax.gaxMod.BackoffSettings = (typingsSlinky.googleGax.mod.^.asInstanceOf[js.Dynamic].applyDynamic("createBackoffSettings")(initialRetryDelayMillis.asInstanceOf[js.Any], retryDelayMultiplier.asInstanceOf[js.Any], maxRetryDelayMillis.asInstanceOf[js.Any], initialRpcTimeoutMillis.asInstanceOf[js.Any], rpcTimeoutMultiplier.asInstanceOf[js.Any], maxRpcTimeoutMillis.asInstanceOf[js.Any], totalTimeoutMillis.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.googleGax.gaxMod.BackoffSettings]
  @scala.inline
  def createBackoffSettings(
    initialRetryDelayMillis: scala.Double,
    retryDelayMultiplier: scala.Double,
    maxRetryDelayMillis: scala.Double,
    initialRpcTimeoutMillis: scala.Double,
    rpcTimeoutMultiplier: scala.Double,
    maxRpcTimeoutMillis: scala.Null,
    totalTimeoutMillis: scala.Double
  ): typingsSlinky.googleGax.gaxMod.BackoffSettings = (typingsSlinky.googleGax.mod.^.asInstanceOf[js.Dynamic].applyDynamic("createBackoffSettings")(initialRetryDelayMillis.asInstanceOf[js.Any], retryDelayMultiplier.asInstanceOf[js.Any], maxRetryDelayMillis.asInstanceOf[js.Any], initialRpcTimeoutMillis.asInstanceOf[js.Any], rpcTimeoutMultiplier.asInstanceOf[js.Any], maxRpcTimeoutMillis.asInstanceOf[js.Any], totalTimeoutMillis.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.googleGax.gaxMod.BackoffSettings]
  @scala.inline
  def createBackoffSettings(
    initialRetryDelayMillis: scala.Double,
    retryDelayMultiplier: scala.Double,
    maxRetryDelayMillis: scala.Double,
    initialRpcTimeoutMillis: scala.Double,
    rpcTimeoutMultiplier: scala.Null,
    maxRpcTimeoutMillis: scala.Double
  ): typingsSlinky.googleGax.gaxMod.BackoffSettings = (typingsSlinky.googleGax.mod.^.asInstanceOf[js.Dynamic].applyDynamic("createBackoffSettings")(initialRetryDelayMillis.asInstanceOf[js.Any], retryDelayMultiplier.asInstanceOf[js.Any], maxRetryDelayMillis.asInstanceOf[js.Any], initialRpcTimeoutMillis.asInstanceOf[js.Any], rpcTimeoutMultiplier.asInstanceOf[js.Any], maxRpcTimeoutMillis.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.googleGax.gaxMod.BackoffSettings]
  @scala.inline
  def createBackoffSettings(
    initialRetryDelayMillis: scala.Double,
    retryDelayMultiplier: scala.Double,
    maxRetryDelayMillis: scala.Double,
    initialRpcTimeoutMillis: scala.Double,
    rpcTimeoutMultiplier: scala.Null,
    maxRpcTimeoutMillis: scala.Double,
    totalTimeoutMillis: scala.Double
  ): typingsSlinky.googleGax.gaxMod.BackoffSettings = (typingsSlinky.googleGax.mod.^.asInstanceOf[js.Dynamic].applyDynamic("createBackoffSettings")(initialRetryDelayMillis.asInstanceOf[js.Any], retryDelayMultiplier.asInstanceOf[js.Any], maxRetryDelayMillis.asInstanceOf[js.Any], initialRpcTimeoutMillis.asInstanceOf[js.Any], rpcTimeoutMultiplier.asInstanceOf[js.Any], maxRpcTimeoutMillis.asInstanceOf[js.Any], totalTimeoutMillis.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.googleGax.gaxMod.BackoffSettings]
  @scala.inline
  def createBackoffSettings(
    initialRetryDelayMillis: scala.Double,
    retryDelayMultiplier: scala.Double,
    maxRetryDelayMillis: scala.Double,
    initialRpcTimeoutMillis: scala.Double,
    rpcTimeoutMultiplier: scala.Null,
    maxRpcTimeoutMillis: scala.Null,
    totalTimeoutMillis: scala.Double
  ): typingsSlinky.googleGax.gaxMod.BackoffSettings = (typingsSlinky.googleGax.mod.^.asInstanceOf[js.Dynamic].applyDynamic("createBackoffSettings")(initialRetryDelayMillis.asInstanceOf[js.Any], retryDelayMultiplier.asInstanceOf[js.Any], maxRetryDelayMillis.asInstanceOf[js.Any], initialRpcTimeoutMillis.asInstanceOf[js.Any], rpcTimeoutMultiplier.asInstanceOf[js.Any], maxRpcTimeoutMillis.asInstanceOf[js.Any], totalTimeoutMillis.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.googleGax.gaxMod.BackoffSettings]
  @scala.inline
  def createBackoffSettings(
    initialRetryDelayMillis: scala.Double,
    retryDelayMultiplier: scala.Double,
    maxRetryDelayMillis: scala.Double,
    initialRpcTimeoutMillis: scala.Null,
    rpcTimeoutMultiplier: scala.Double
  ): typingsSlinky.googleGax.gaxMod.BackoffSettings = (typingsSlinky.googleGax.mod.^.asInstanceOf[js.Dynamic].applyDynamic("createBackoffSettings")(initialRetryDelayMillis.asInstanceOf[js.Any], retryDelayMultiplier.asInstanceOf[js.Any], maxRetryDelayMillis.asInstanceOf[js.Any], initialRpcTimeoutMillis.asInstanceOf[js.Any], rpcTimeoutMultiplier.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.googleGax.gaxMod.BackoffSettings]
  @scala.inline
  def createBackoffSettings(
    initialRetryDelayMillis: scala.Double,
    retryDelayMultiplier: scala.Double,
    maxRetryDelayMillis: scala.Double,
    initialRpcTimeoutMillis: scala.Null,
    rpcTimeoutMultiplier: scala.Double,
    maxRpcTimeoutMillis: scala.Double
  ): typingsSlinky.googleGax.gaxMod.BackoffSettings = (typingsSlinky.googleGax.mod.^.asInstanceOf[js.Dynamic].applyDynamic("createBackoffSettings")(initialRetryDelayMillis.asInstanceOf[js.Any], retryDelayMultiplier.asInstanceOf[js.Any], maxRetryDelayMillis.asInstanceOf[js.Any], initialRpcTimeoutMillis.asInstanceOf[js.Any], rpcTimeoutMultiplier.asInstanceOf[js.Any], maxRpcTimeoutMillis.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.googleGax.gaxMod.BackoffSettings]
  @scala.inline
  def createBackoffSettings(
    initialRetryDelayMillis: scala.Double,
    retryDelayMultiplier: scala.Double,
    maxRetryDelayMillis: scala.Double,
    initialRpcTimeoutMillis: scala.Null,
    rpcTimeoutMultiplier: scala.Double,
    maxRpcTimeoutMillis: scala.Double,
    totalTimeoutMillis: scala.Double
  ): typingsSlinky.googleGax.gaxMod.BackoffSettings = (typingsSlinky.googleGax.mod.^.asInstanceOf[js.Dynamic].applyDynamic("createBackoffSettings")(initialRetryDelayMillis.asInstanceOf[js.Any], retryDelayMultiplier.asInstanceOf[js.Any], maxRetryDelayMillis.asInstanceOf[js.Any], initialRpcTimeoutMillis.asInstanceOf[js.Any], rpcTimeoutMultiplier.asInstanceOf[js.Any], maxRpcTimeoutMillis.asInstanceOf[js.Any], totalTimeoutMillis.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.googleGax.gaxMod.BackoffSettings]
  @scala.inline
  def createBackoffSettings(
    initialRetryDelayMillis: scala.Double,
    retryDelayMultiplier: scala.Double,
    maxRetryDelayMillis: scala.Double,
    initialRpcTimeoutMillis: scala.Null,
    rpcTimeoutMultiplier: scala.Double,
    maxRpcTimeoutMillis: scala.Null,
    totalTimeoutMillis: scala.Double
  ): typingsSlinky.googleGax.gaxMod.BackoffSettings = (typingsSlinky.googleGax.mod.^.asInstanceOf[js.Dynamic].applyDynamic("createBackoffSettings")(initialRetryDelayMillis.asInstanceOf[js.Any], retryDelayMultiplier.asInstanceOf[js.Any], maxRetryDelayMillis.asInstanceOf[js.Any], initialRpcTimeoutMillis.asInstanceOf[js.Any], rpcTimeoutMultiplier.asInstanceOf[js.Any], maxRpcTimeoutMillis.asInstanceOf[js.Any], totalTimeoutMillis.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.googleGax.gaxMod.BackoffSettings]
  @scala.inline
  def createBackoffSettings(
    initialRetryDelayMillis: scala.Double,
    retryDelayMultiplier: scala.Double,
    maxRetryDelayMillis: scala.Double,
    initialRpcTimeoutMillis: scala.Null,
    rpcTimeoutMultiplier: scala.Null,
    maxRpcTimeoutMillis: scala.Double
  ): typingsSlinky.googleGax.gaxMod.BackoffSettings = (typingsSlinky.googleGax.mod.^.asInstanceOf[js.Dynamic].applyDynamic("createBackoffSettings")(initialRetryDelayMillis.asInstanceOf[js.Any], retryDelayMultiplier.asInstanceOf[js.Any], maxRetryDelayMillis.asInstanceOf[js.Any], initialRpcTimeoutMillis.asInstanceOf[js.Any], rpcTimeoutMultiplier.asInstanceOf[js.Any], maxRpcTimeoutMillis.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.googleGax.gaxMod.BackoffSettings]
  @scala.inline
  def createBackoffSettings(
    initialRetryDelayMillis: scala.Double,
    retryDelayMultiplier: scala.Double,
    maxRetryDelayMillis: scala.Double,
    initialRpcTimeoutMillis: scala.Null,
    rpcTimeoutMultiplier: scala.Null,
    maxRpcTimeoutMillis: scala.Double,
    totalTimeoutMillis: scala.Double
  ): typingsSlinky.googleGax.gaxMod.BackoffSettings = (typingsSlinky.googleGax.mod.^.asInstanceOf[js.Dynamic].applyDynamic("createBackoffSettings")(initialRetryDelayMillis.asInstanceOf[js.Any], retryDelayMultiplier.asInstanceOf[js.Any], maxRetryDelayMillis.asInstanceOf[js.Any], initialRpcTimeoutMillis.asInstanceOf[js.Any], rpcTimeoutMultiplier.asInstanceOf[js.Any], maxRpcTimeoutMillis.asInstanceOf[js.Any], totalTimeoutMillis.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.googleGax.gaxMod.BackoffSettings]
  @scala.inline
  def createBackoffSettings(
    initialRetryDelayMillis: scala.Double,
    retryDelayMultiplier: scala.Double,
    maxRetryDelayMillis: scala.Double,
    initialRpcTimeoutMillis: scala.Null,
    rpcTimeoutMultiplier: scala.Null,
    maxRpcTimeoutMillis: scala.Null,
    totalTimeoutMillis: scala.Double
  ): typingsSlinky.googleGax.gaxMod.BackoffSettings = (typingsSlinky.googleGax.mod.^.asInstanceOf[js.Dynamic].applyDynamic("createBackoffSettings")(initialRetryDelayMillis.asInstanceOf[js.Any], retryDelayMultiplier.asInstanceOf[js.Any], maxRetryDelayMillis.asInstanceOf[js.Any], initialRpcTimeoutMillis.asInstanceOf[js.Any], rpcTimeoutMultiplier.asInstanceOf[js.Any], maxRpcTimeoutMillis.asInstanceOf[js.Any], totalTimeoutMillis.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.googleGax.gaxMod.BackoffSettings]
  
  @scala.inline
  def createBundleOptions(options: typingsSlinky.googleGax.gaxMod.BundlingConfig): typingsSlinky.googleGax.bundleExecutorMod.BundleOptions = typingsSlinky.googleGax.mod.^.asInstanceOf[js.Dynamic].applyDynamic("createBundleOptions")(options.asInstanceOf[js.Any]).asInstanceOf[typingsSlinky.googleGax.bundleExecutorMod.BundleOptions]
  
  @scala.inline
  def createByteLengthFunction: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof GrpcClient.createByteLengthFunction */ js.Any = typingsSlinky.googleGax.mod.^.asInstanceOf[js.Dynamic].selectDynamic("createByteLengthFunction").asInstanceOf[/* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof GrpcClient.createByteLengthFunction */ js.Any]
  
  @scala.inline
  def createDefaultBackoffSettings(): typingsSlinky.googleGax.gaxMod.BackoffSettings = typingsSlinky.googleGax.mod.^.asInstanceOf[js.Dynamic].applyDynamic("createDefaultBackoffSettings")().asInstanceOf[typingsSlinky.googleGax.gaxMod.BackoffSettings]
  
  @scala.inline
  def createMaxRetriesBackoffSettings(
    initialRetryDelayMillis: scala.Double,
    retryDelayMultiplier: scala.Double,
    maxRetryDelayMillis: scala.Double,
    initialRpcTimeoutMillis: scala.Double,
    rpcTimeoutMultiplier: scala.Double,
    maxRpcTimeoutMillis: scala.Double,
    maxRetries: scala.Double
  ): typingsSlinky.googleGax.gaxMod.BackoffSettings = (typingsSlinky.googleGax.mod.^.asInstanceOf[js.Dynamic].applyDynamic("createMaxRetriesBackoffSettings")(initialRetryDelayMillis.asInstanceOf[js.Any], retryDelayMultiplier.asInstanceOf[js.Any], maxRetryDelayMillis.asInstanceOf[js.Any], initialRpcTimeoutMillis.asInstanceOf[js.Any], rpcTimeoutMultiplier.asInstanceOf[js.Any], maxRpcTimeoutMillis.asInstanceOf[js.Any], maxRetries.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.googleGax.gaxMod.BackoffSettings]
  
  @scala.inline
  def createRetryOptions(
    retryCodes: js.Array[scala.Double],
    backoffSettings: typingsSlinky.googleGax.gaxMod.BackoffSettings
  ): typingsSlinky.googleGax.gaxMod.RetryOptions = (typingsSlinky.googleGax.mod.^.asInstanceOf[js.Dynamic].applyDynamic("createRetryOptions")(retryCodes.asInstanceOf[js.Any], backoffSettings.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.googleGax.gaxMod.RetryOptions]
  
  @scala.inline
  def operation(
    op: typingsSlinky.googleGax.longrunningMod.LROOperation,
    longrunningDescriptor: typingsSlinky.googleGax.longRunningDescriptorMod.LongRunningDescriptor,
    backoffSettings: typingsSlinky.googleGax.gaxMod.BackoffSettings
  ): typingsSlinky.googleGax.longrunningMod.Operation_ = (typingsSlinky.googleGax.mod.^.asInstanceOf[js.Dynamic].applyDynamic("operation")(op.asInstanceOf[js.Any], longrunningDescriptor.asInstanceOf[js.Any], backoffSettings.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.googleGax.longrunningMod.Operation_]
  @scala.inline
  def operation(
    op: typingsSlinky.googleGax.longrunningMod.LROOperation,
    longrunningDescriptor: typingsSlinky.googleGax.longRunningDescriptorMod.LongRunningDescriptor,
    backoffSettings: typingsSlinky.googleGax.gaxMod.BackoffSettings,
    callOptions: typingsSlinky.googleGax.gaxMod.CallOptions
  ): typingsSlinky.googleGax.longrunningMod.Operation_ = (typingsSlinky.googleGax.mod.^.asInstanceOf[js.Dynamic].applyDynamic("operation")(op.asInstanceOf[js.Any], longrunningDescriptor.asInstanceOf[js.Any], backoffSettings.asInstanceOf[js.Any], callOptions.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.googleGax.longrunningMod.Operation_]
  
  @scala.inline
  def version: js.Any = typingsSlinky.googleGax.mod.^.asInstanceOf[js.Dynamic].selectDynamic("version").asInstanceOf[js.Any]
}
