package typingsSlinky.pulumiAws.mod

import typingsSlinky.pulumiAws.enumsLambdaMod.Runtime
import typingsSlinky.pulumiAws.eventSourceMappingMod.EventSourceMappingArgs
import typingsSlinky.pulumiAws.eventSourceMappingMod.EventSourceMappingState
import typingsSlinky.pulumiAws.functionEventInvokeConfigMod.FunctionEventInvokeConfigArgs
import typingsSlinky.pulumiAws.functionEventInvokeConfigMod.FunctionEventInvokeConfigState
import typingsSlinky.pulumiAws.getFunctionMod.GetFunctionArgs
import typingsSlinky.pulumiAws.getFunctionMod.GetFunctionResult
import typingsSlinky.pulumiAws.getInvocationMod.GetInvocationArgs
import typingsSlinky.pulumiAws.getInvocationMod.GetInvocationResult
import typingsSlinky.pulumiAws.getLayerVersionMod.GetLayerVersionArgs
import typingsSlinky.pulumiAws.getLayerVersionMod.GetLayerVersionResult
import typingsSlinky.pulumiAws.iamMod.Role
import typingsSlinky.pulumiAws.lambdaAliasMod.AliasArgs
import typingsSlinky.pulumiAws.lambdaAliasMod.AliasState
import typingsSlinky.pulumiAws.lambdaFunctionMod.FunctionArgs
import typingsSlinky.pulumiAws.lambdaFunctionMod.FunctionState
import typingsSlinky.pulumiAws.lambdaGetAliasMod.GetAliasArgs
import typingsSlinky.pulumiAws.lambdaGetAliasMod.GetAliasResult
import typingsSlinky.pulumiAws.lambdaMixinsMod.CallbackFunctionArgs
import typingsSlinky.pulumiAws.lambdaMixinsMod.EventHandler
import typingsSlinky.pulumiAws.layerVersionMod.LayerVersionArgs
import typingsSlinky.pulumiAws.layerVersionMod.LayerVersionState
import typingsSlinky.pulumiAws.permissionMod.PermissionArgs
import typingsSlinky.pulumiAws.permissionMod.PermissionState
import typingsSlinky.pulumiAws.provisionedConcurrencyConfigMod.ProvisionedConcurrencyConfigArgs
import typingsSlinky.pulumiAws.provisionedConcurrencyConfigMod.ProvisionedConcurrencyConfigState
import typingsSlinky.pulumiAws.pulumiAwsStrings.dotnetcore2Dot1
import typingsSlinky.pulumiAws.pulumiAwsStrings.dotnetcore3Dot1
import typingsSlinky.pulumiAws.pulumiAwsStrings.go1Dotx
import typingsSlinky.pulumiAws.pulumiAwsStrings.java11
import typingsSlinky.pulumiAws.pulumiAwsStrings.java8
import typingsSlinky.pulumiAws.pulumiAwsStrings.java8Dotal2
import typingsSlinky.pulumiAws.pulumiAwsStrings.nodejs10Dotx
import typingsSlinky.pulumiAws.pulumiAwsStrings.nodejs12Dotx
import typingsSlinky.pulumiAws.pulumiAwsStrings.provided
import typingsSlinky.pulumiAws.pulumiAwsStrings.providedDotal2
import typingsSlinky.pulumiAws.pulumiAwsStrings.python2Dot7
import typingsSlinky.pulumiAws.pulumiAwsStrings.python3Dot6
import typingsSlinky.pulumiAws.pulumiAwsStrings.python3Dot7
import typingsSlinky.pulumiAws.pulumiAwsStrings.python3Dot8
import typingsSlinky.pulumiAws.pulumiAwsStrings.ruby2Dot5
import typingsSlinky.pulumiAws.pulumiAwsStrings.ruby2Dot7
import typingsSlinky.pulumiPulumi.invokeMod.InvokeOptions
import typingsSlinky.pulumiPulumi.outputMod.Input
import typingsSlinky.pulumiPulumi.resourceMod.ComponentResourceOptions
import typingsSlinky.pulumiPulumi.resourceMod.CustomResourceOptions
import typingsSlinky.pulumiPulumi.resourceMod.ID
import typingsSlinky.pulumiPulumi.resourceMod.ResourceOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object lambda {
  
  @JSImport("@pulumi/aws", "lambda")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@pulumi/aws", "lambda.Alias")
  @js.native
  class Alias protected ()
    extends typingsSlinky.pulumiAws.lambdaMod.Alias {
    /**
      * Create a Alias resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: AliasArgs) = this()
    def this(name: String, args: AliasArgs, opts: CustomResourceOptions) = this()
  }
  /* static members */
  object Alias {
    
    /**
      * Get an existing Alias resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @JSImport("@pulumi/aws", "lambda.Alias.get")
    @js.native
    def get(name: String, id: Input[ID]): typingsSlinky.pulumiAws.lambdaAliasMod.Alias = js.native
    @JSImport("@pulumi/aws", "lambda.Alias.get")
    @js.native
    def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): typingsSlinky.pulumiAws.lambdaAliasMod.Alias = js.native
    @JSImport("@pulumi/aws", "lambda.Alias.get")
    @js.native
    def get(name: String, id: Input[ID], state: AliasState): typingsSlinky.pulumiAws.lambdaAliasMod.Alias = js.native
    @JSImport("@pulumi/aws", "lambda.Alias.get")
    @js.native
    def get(name: String, id: Input[ID], state: AliasState, opts: CustomResourceOptions): typingsSlinky.pulumiAws.lambdaAliasMod.Alias = js.native
    
    /**
      * Returns true if the given object is an instance of Alias.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @JSImport("@pulumi/aws", "lambda.Alias.isInstance")
    @js.native
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/lambda/alias.Alias */ Boolean = js.native
  }
  
  @JSImport("@pulumi/aws", "lambda.CallbackFunction")
  @js.native
  class CallbackFunction[E, R] protected ()
    extends typingsSlinky.pulumiAws.lambdaMod.CallbackFunction[E, R] {
    def this(name: String, args: CallbackFunctionArgs[E, R]) = this()
    def this(name: String, args: CallbackFunctionArgs[E, R], opts: CustomResourceOptions) = this()
  }
  
  @JSImport("@pulumi/aws", "lambda.CustomRuntime")
  @js.native
  def CustomRuntime: Runtime = js.native
  @scala.inline
  def CustomRuntime_=(x: Runtime): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("CustomRuntime")(x.asInstanceOf[js.Any])
  
  @JSImport("@pulumi/aws", "lambda.DotnetCore1d0Runtime")
  @js.native
  def DotnetCore1d0Runtime: dotnetcore2Dot1 | dotnetcore3Dot1 | go1Dotx | java8 | java8Dotal2 | java11 | ruby2Dot5 | ruby2Dot7 | nodejs10Dotx | nodejs12Dotx | python2Dot7 | python3Dot6 | python3Dot7 | python3Dot8 | provided | providedDotal2 = js.native
  @scala.inline
  def DotnetCore1d0Runtime_=(
    x: dotnetcore2Dot1 | dotnetcore3Dot1 | go1Dotx | java8 | java8Dotal2 | java11 | ruby2Dot5 | ruby2Dot7 | nodejs10Dotx | nodejs12Dotx | python2Dot7 | python3Dot6 | python3Dot7 | python3Dot8 | provided | providedDotal2
  ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DotnetCore1d0Runtime")(x.asInstanceOf[js.Any])
  
  @JSImport("@pulumi/aws", "lambda.DotnetCore2d0Runtime")
  @js.native
  def DotnetCore2d0Runtime: dotnetcore2Dot1 | dotnetcore3Dot1 | go1Dotx | java8 | java8Dotal2 | java11 | ruby2Dot5 | ruby2Dot7 | nodejs10Dotx | nodejs12Dotx | python2Dot7 | python3Dot6 | python3Dot7 | python3Dot8 | provided | providedDotal2 = js.native
  @scala.inline
  def DotnetCore2d0Runtime_=(
    x: dotnetcore2Dot1 | dotnetcore3Dot1 | go1Dotx | java8 | java8Dotal2 | java11 | ruby2Dot5 | ruby2Dot7 | nodejs10Dotx | nodejs12Dotx | python2Dot7 | python3Dot6 | python3Dot7 | python3Dot8 | provided | providedDotal2
  ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DotnetCore2d0Runtime")(x.asInstanceOf[js.Any])
  
  @JSImport("@pulumi/aws", "lambda.DotnetCore2d1Runtime")
  @js.native
  def DotnetCore2d1Runtime: Runtime = js.native
  @scala.inline
  def DotnetCore2d1Runtime_=(x: Runtime): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DotnetCore2d1Runtime")(x.asInstanceOf[js.Any])
  
  @JSImport("@pulumi/aws", "lambda.DotnetCore3d1Runtime")
  @js.native
  def DotnetCore3d1Runtime: Runtime = js.native
  @scala.inline
  def DotnetCore3d1Runtime_=(x: Runtime): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DotnetCore3d1Runtime")(x.asInstanceOf[js.Any])
  
  @JSImport("@pulumi/aws", "lambda.EventSourceMapping")
  @js.native
  class EventSourceMapping protected ()
    extends typingsSlinky.pulumiAws.lambdaMod.EventSourceMapping {
    /**
      * Create a EventSourceMapping resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: EventSourceMappingArgs) = this()
    def this(name: String, args: EventSourceMappingArgs, opts: CustomResourceOptions) = this()
  }
  /* static members */
  object EventSourceMapping {
    
    /**
      * Get an existing EventSourceMapping resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @JSImport("@pulumi/aws", "lambda.EventSourceMapping.get")
    @js.native
    def get(name: String, id: Input[ID]): typingsSlinky.pulumiAws.eventSourceMappingMod.EventSourceMapping = js.native
    @JSImport("@pulumi/aws", "lambda.EventSourceMapping.get")
    @js.native
    def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): typingsSlinky.pulumiAws.eventSourceMappingMod.EventSourceMapping = js.native
    @JSImport("@pulumi/aws", "lambda.EventSourceMapping.get")
    @js.native
    def get(name: String, id: Input[ID], state: EventSourceMappingState): typingsSlinky.pulumiAws.eventSourceMappingMod.EventSourceMapping = js.native
    @JSImport("@pulumi/aws", "lambda.EventSourceMapping.get")
    @js.native
    def get(name: String, id: Input[ID], state: EventSourceMappingState, opts: CustomResourceOptions): typingsSlinky.pulumiAws.eventSourceMappingMod.EventSourceMapping = js.native
    
    /**
      * Returns true if the given object is an instance of EventSourceMapping.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @JSImport("@pulumi/aws", "lambda.EventSourceMapping.isInstance")
    @js.native
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/lambda/eventSourceMapping.EventSourceMapping */ Boolean = js.native
  }
  
  @JSImport("@pulumi/aws", "lambda.EventSubscription")
  @js.native
  class EventSubscription protected ()
    extends typingsSlinky.pulumiAws.lambdaMod.EventSubscription {
    def this(`type`: String, name: String) = this()
    def this(`type`: String, name: String, opts: ComponentResourceOptions) = this()
  }
  
  @JSImport("@pulumi/aws", "lambda.Function")
  @js.native
  class Function protected ()
    extends typingsSlinky.pulumiAws.lambdaMod.Function {
    /**
      * Create a Function resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: FunctionArgs) = this()
    def this(name: String, args: FunctionArgs, opts: CustomResourceOptions) = this()
  }
  /* static members */
  object Function {
    
    /**
      * Get an existing Function resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @JSImport("@pulumi/aws", "lambda.Function.get")
    @js.native
    def get(name: String, id: Input[ID]): typingsSlinky.pulumiAws.lambdaFunctionMod.Function = js.native
    @JSImport("@pulumi/aws", "lambda.Function.get")
    @js.native
    def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): typingsSlinky.pulumiAws.lambdaFunctionMod.Function = js.native
    @JSImport("@pulumi/aws", "lambda.Function.get")
    @js.native
    def get(name: String, id: Input[ID], state: FunctionState): typingsSlinky.pulumiAws.lambdaFunctionMod.Function = js.native
    @JSImport("@pulumi/aws", "lambda.Function.get")
    @js.native
    def get(name: String, id: Input[ID], state: FunctionState, opts: CustomResourceOptions): typingsSlinky.pulumiAws.lambdaFunctionMod.Function = js.native
    
    /**
      * Returns true if the given object is an instance of Function.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @JSImport("@pulumi/aws", "lambda.Function.isInstance")
    @js.native
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/lambda/function.Function */ Boolean = js.native
  }
  
  @JSImport("@pulumi/aws", "lambda.FunctionEventInvokeConfig")
  @js.native
  class FunctionEventInvokeConfig protected ()
    extends typingsSlinky.pulumiAws.lambdaMod.FunctionEventInvokeConfig {
    /**
      * Create a FunctionEventInvokeConfig resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: FunctionEventInvokeConfigArgs) = this()
    def this(name: String, args: FunctionEventInvokeConfigArgs, opts: CustomResourceOptions) = this()
  }
  /* static members */
  object FunctionEventInvokeConfig {
    
    /**
      * Get an existing FunctionEventInvokeConfig resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @JSImport("@pulumi/aws", "lambda.FunctionEventInvokeConfig.get")
    @js.native
    def get(name: String, id: Input[ID]): typingsSlinky.pulumiAws.functionEventInvokeConfigMod.FunctionEventInvokeConfig = js.native
    @JSImport("@pulumi/aws", "lambda.FunctionEventInvokeConfig.get")
    @js.native
    def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): typingsSlinky.pulumiAws.functionEventInvokeConfigMod.FunctionEventInvokeConfig = js.native
    @JSImport("@pulumi/aws", "lambda.FunctionEventInvokeConfig.get")
    @js.native
    def get(name: String, id: Input[ID], state: FunctionEventInvokeConfigState): typingsSlinky.pulumiAws.functionEventInvokeConfigMod.FunctionEventInvokeConfig = js.native
    @JSImport("@pulumi/aws", "lambda.FunctionEventInvokeConfig.get")
    @js.native
    def get(name: String, id: Input[ID], state: FunctionEventInvokeConfigState, opts: CustomResourceOptions): typingsSlinky.pulumiAws.functionEventInvokeConfigMod.FunctionEventInvokeConfig = js.native
    
    /**
      * Returns true if the given object is an instance of FunctionEventInvokeConfig.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @JSImport("@pulumi/aws", "lambda.FunctionEventInvokeConfig.isInstance")
    @js.native
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/lambda/functionEventInvokeConfig.FunctionEventInvokeConfig */ Boolean = js.native
  }
  
  @JSImport("@pulumi/aws", "lambda.Go1dxRuntime")
  @js.native
  def Go1dxRuntime: Runtime = js.native
  @scala.inline
  def Go1dxRuntime_=(x: Runtime): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Go1dxRuntime")(x.asInstanceOf[js.Any])
  
  @JSImport("@pulumi/aws", "lambda.Java11Runtime")
  @js.native
  def Java11Runtime: Runtime = js.native
  @scala.inline
  def Java11Runtime_=(x: Runtime): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Java11Runtime")(x.asInstanceOf[js.Any])
  
  @JSImport("@pulumi/aws", "lambda.Java8Runtime")
  @js.native
  def Java8Runtime: Runtime = js.native
  @scala.inline
  def Java8Runtime_=(x: Runtime): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Java8Runtime")(x.asInstanceOf[js.Any])
  
  @JSImport("@pulumi/aws", "lambda.LayerVersion")
  @js.native
  class LayerVersion protected ()
    extends typingsSlinky.pulumiAws.lambdaMod.LayerVersion {
    /**
      * Create a LayerVersion resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: LayerVersionArgs) = this()
    def this(name: String, args: LayerVersionArgs, opts: CustomResourceOptions) = this()
  }
  /* static members */
  object LayerVersion {
    
    /**
      * Get an existing LayerVersion resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @JSImport("@pulumi/aws", "lambda.LayerVersion.get")
    @js.native
    def get(name: String, id: Input[ID]): typingsSlinky.pulumiAws.layerVersionMod.LayerVersion = js.native
    @JSImport("@pulumi/aws", "lambda.LayerVersion.get")
    @js.native
    def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): typingsSlinky.pulumiAws.layerVersionMod.LayerVersion = js.native
    @JSImport("@pulumi/aws", "lambda.LayerVersion.get")
    @js.native
    def get(name: String, id: Input[ID], state: LayerVersionState): typingsSlinky.pulumiAws.layerVersionMod.LayerVersion = js.native
    @JSImport("@pulumi/aws", "lambda.LayerVersion.get")
    @js.native
    def get(name: String, id: Input[ID], state: LayerVersionState, opts: CustomResourceOptions): typingsSlinky.pulumiAws.layerVersionMod.LayerVersion = js.native
    
    /**
      * Returns true if the given object is an instance of LayerVersion.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @JSImport("@pulumi/aws", "lambda.LayerVersion.isInstance")
    @js.native
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/lambda/layerVersion.LayerVersion */ Boolean = js.native
  }
  
  @JSImport("@pulumi/aws", "lambda.NodeJS10dXRuntime")
  @js.native
  def NodeJS10dXRuntime: Runtime = js.native
  @scala.inline
  def NodeJS10dXRuntime_=(x: Runtime): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("NodeJS10dXRuntime")(x.asInstanceOf[js.Any])
  
  @JSImport("@pulumi/aws", "lambda.NodeJS12dXRuntime")
  @js.native
  def NodeJS12dXRuntime: Runtime = js.native
  @scala.inline
  def NodeJS12dXRuntime_=(x: Runtime): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("NodeJS12dXRuntime")(x.asInstanceOf[js.Any])
  
  @JSImport("@pulumi/aws", "lambda.NodeJS4d3EdgeRuntime")
  @js.native
  def NodeJS4d3EdgeRuntime: dotnetcore2Dot1 | dotnetcore3Dot1 | go1Dotx | java8 | java8Dotal2 | java11 | ruby2Dot5 | ruby2Dot7 | nodejs10Dotx | nodejs12Dotx | python2Dot7 | python3Dot6 | python3Dot7 | python3Dot8 | provided | providedDotal2 = js.native
  @scala.inline
  def NodeJS4d3EdgeRuntime_=(
    x: dotnetcore2Dot1 | dotnetcore3Dot1 | go1Dotx | java8 | java8Dotal2 | java11 | ruby2Dot5 | ruby2Dot7 | nodejs10Dotx | nodejs12Dotx | python2Dot7 | python3Dot6 | python3Dot7 | python3Dot8 | provided | providedDotal2
  ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("NodeJS4d3EdgeRuntime")(x.asInstanceOf[js.Any])
  
  @JSImport("@pulumi/aws", "lambda.NodeJS4d3Runtime")
  @js.native
  def NodeJS4d3Runtime: dotnetcore2Dot1 | dotnetcore3Dot1 | go1Dotx | java8 | java8Dotal2 | java11 | ruby2Dot5 | ruby2Dot7 | nodejs10Dotx | nodejs12Dotx | python2Dot7 | python3Dot6 | python3Dot7 | python3Dot8 | provided | providedDotal2 = js.native
  @scala.inline
  def NodeJS4d3Runtime_=(
    x: dotnetcore2Dot1 | dotnetcore3Dot1 | go1Dotx | java8 | java8Dotal2 | java11 | ruby2Dot5 | ruby2Dot7 | nodejs10Dotx | nodejs12Dotx | python2Dot7 | python3Dot6 | python3Dot7 | python3Dot8 | provided | providedDotal2
  ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("NodeJS4d3Runtime")(x.asInstanceOf[js.Any])
  
  @JSImport("@pulumi/aws", "lambda.NodeJS6d10Runtime")
  @js.native
  def NodeJS6d10Runtime: dotnetcore2Dot1 | dotnetcore3Dot1 | go1Dotx | java8 | java8Dotal2 | java11 | ruby2Dot5 | ruby2Dot7 | nodejs10Dotx | nodejs12Dotx | python2Dot7 | python3Dot6 | python3Dot7 | python3Dot8 | provided | providedDotal2 = js.native
  @scala.inline
  def NodeJS6d10Runtime_=(
    x: dotnetcore2Dot1 | dotnetcore3Dot1 | go1Dotx | java8 | java8Dotal2 | java11 | ruby2Dot5 | ruby2Dot7 | nodejs10Dotx | nodejs12Dotx | python2Dot7 | python3Dot6 | python3Dot7 | python3Dot8 | provided | providedDotal2
  ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("NodeJS6d10Runtime")(x.asInstanceOf[js.Any])
  
  @JSImport("@pulumi/aws", "lambda.NodeJS8d10Runtime")
  @js.native
  def NodeJS8d10Runtime: dotnetcore2Dot1 | dotnetcore3Dot1 | go1Dotx | java8 | java8Dotal2 | java11 | ruby2Dot5 | ruby2Dot7 | nodejs10Dotx | nodejs12Dotx | python2Dot7 | python3Dot6 | python3Dot7 | python3Dot8 | provided | providedDotal2 = js.native
  @scala.inline
  def NodeJS8d10Runtime_=(
    x: dotnetcore2Dot1 | dotnetcore3Dot1 | go1Dotx | java8 | java8Dotal2 | java11 | ruby2Dot5 | ruby2Dot7 | nodejs10Dotx | nodejs12Dotx | python2Dot7 | python3Dot6 | python3Dot7 | python3Dot8 | provided | providedDotal2
  ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("NodeJS8d10Runtime")(x.asInstanceOf[js.Any])
  
  @JSImport("@pulumi/aws", "lambda.NodeJSRuntime")
  @js.native
  def NodeJSRuntime: dotnetcore2Dot1 | dotnetcore3Dot1 | go1Dotx | java8 | java8Dotal2 | java11 | ruby2Dot5 | ruby2Dot7 | nodejs10Dotx | nodejs12Dotx | python2Dot7 | python3Dot6 | python3Dot7 | python3Dot8 | provided | providedDotal2 = js.native
  @scala.inline
  def NodeJSRuntime_=(
    x: dotnetcore2Dot1 | dotnetcore3Dot1 | go1Dotx | java8 | java8Dotal2 | java11 | ruby2Dot5 | ruby2Dot7 | nodejs10Dotx | nodejs12Dotx | python2Dot7 | python3Dot6 | python3Dot7 | python3Dot8 | provided | providedDotal2
  ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("NodeJSRuntime")(x.asInstanceOf[js.Any])
  
  @JSImport("@pulumi/aws", "lambda.Permission")
  @js.native
  class Permission protected ()
    extends typingsSlinky.pulumiAws.lambdaMod.Permission {
    /**
      * Create a Permission resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: PermissionArgs) = this()
    def this(name: String, args: PermissionArgs, opts: CustomResourceOptions) = this()
  }
  /* static members */
  object Permission {
    
    /**
      * Get an existing Permission resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @JSImport("@pulumi/aws", "lambda.Permission.get")
    @js.native
    def get(name: String, id: Input[ID]): typingsSlinky.pulumiAws.permissionMod.Permission = js.native
    @JSImport("@pulumi/aws", "lambda.Permission.get")
    @js.native
    def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): typingsSlinky.pulumiAws.permissionMod.Permission = js.native
    @JSImport("@pulumi/aws", "lambda.Permission.get")
    @js.native
    def get(name: String, id: Input[ID], state: PermissionState): typingsSlinky.pulumiAws.permissionMod.Permission = js.native
    @JSImport("@pulumi/aws", "lambda.Permission.get")
    @js.native
    def get(name: String, id: Input[ID], state: PermissionState, opts: CustomResourceOptions): typingsSlinky.pulumiAws.permissionMod.Permission = js.native
    
    /**
      * Returns true if the given object is an instance of Permission.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @JSImport("@pulumi/aws", "lambda.Permission.isInstance")
    @js.native
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/lambda/permission.Permission */ Boolean = js.native
  }
  
  @JSImport("@pulumi/aws", "lambda.ProvisionedConcurrencyConfig")
  @js.native
  class ProvisionedConcurrencyConfig protected ()
    extends typingsSlinky.pulumiAws.lambdaMod.ProvisionedConcurrencyConfig {
    /**
      * Create a ProvisionedConcurrencyConfig resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: ProvisionedConcurrencyConfigArgs) = this()
    def this(name: String, args: ProvisionedConcurrencyConfigArgs, opts: CustomResourceOptions) = this()
  }
  /* static members */
  object ProvisionedConcurrencyConfig {
    
    /**
      * Get an existing ProvisionedConcurrencyConfig resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @JSImport("@pulumi/aws", "lambda.ProvisionedConcurrencyConfig.get")
    @js.native
    def get(name: String, id: Input[ID]): typingsSlinky.pulumiAws.provisionedConcurrencyConfigMod.ProvisionedConcurrencyConfig = js.native
    @JSImport("@pulumi/aws", "lambda.ProvisionedConcurrencyConfig.get")
    @js.native
    def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): typingsSlinky.pulumiAws.provisionedConcurrencyConfigMod.ProvisionedConcurrencyConfig = js.native
    @JSImport("@pulumi/aws", "lambda.ProvisionedConcurrencyConfig.get")
    @js.native
    def get(name: String, id: Input[ID], state: ProvisionedConcurrencyConfigState): typingsSlinky.pulumiAws.provisionedConcurrencyConfigMod.ProvisionedConcurrencyConfig = js.native
    @JSImport("@pulumi/aws", "lambda.ProvisionedConcurrencyConfig.get")
    @js.native
    def get(name: String, id: Input[ID], state: ProvisionedConcurrencyConfigState, opts: CustomResourceOptions): typingsSlinky.pulumiAws.provisionedConcurrencyConfigMod.ProvisionedConcurrencyConfig = js.native
    
    /**
      * Returns true if the given object is an instance of ProvisionedConcurrencyConfig.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @JSImport("@pulumi/aws", "lambda.ProvisionedConcurrencyConfig.isInstance")
    @js.native
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/lambda/provisionedConcurrencyConfig.ProvisionedConcurrencyConfig */ Boolean = js.native
  }
  
  @JSImport("@pulumi/aws", "lambda.Python2d7Runtime")
  @js.native
  def Python2d7Runtime: Runtime = js.native
  @scala.inline
  def Python2d7Runtime_=(x: Runtime): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Python2d7Runtime")(x.asInstanceOf[js.Any])
  
  @JSImport("@pulumi/aws", "lambda.Python3d6Runtime")
  @js.native
  def Python3d6Runtime: Runtime = js.native
  @scala.inline
  def Python3d6Runtime_=(x: Runtime): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Python3d6Runtime")(x.asInstanceOf[js.Any])
  
  @JSImport("@pulumi/aws", "lambda.Python3d7Runtime")
  @js.native
  def Python3d7Runtime: Runtime = js.native
  @scala.inline
  def Python3d7Runtime_=(x: Runtime): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Python3d7Runtime")(x.asInstanceOf[js.Any])
  
  @JSImport("@pulumi/aws", "lambda.Python3d8Runtime")
  @js.native
  def Python3d8Runtime: Runtime = js.native
  @scala.inline
  def Python3d8Runtime_=(x: Runtime): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Python3d8Runtime")(x.asInstanceOf[js.Any])
  
  @JSImport("@pulumi/aws", "lambda.Ruby2d5Runtime")
  @js.native
  def Ruby2d5Runtime: Runtime = js.native
  @scala.inline
  def Ruby2d5Runtime_=(x: Runtime): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Ruby2d5Runtime")(x.asInstanceOf[js.Any])
  
  @JSImport("@pulumi/aws", "lambda.Ruby2d7Runtime")
  @js.native
  def Ruby2d7Runtime: Runtime = js.native
  @scala.inline
  def Ruby2d7Runtime_=(x: Runtime): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Ruby2d7Runtime")(x.asInstanceOf[js.Any])
  
  object Runtime {
    
    @JSImport("@pulumi/aws", "lambda.Runtime.Custom")
    @js.native
    val Custom: provided = js.native
    
    @JSImport("@pulumi/aws", "lambda.Runtime.CustomAL2")
    @js.native
    val CustomAL2: providedDotal2 = js.native
    
    @JSImport("@pulumi/aws", "lambda.Runtime.DotnetCore2d1")
    @js.native
    val DotnetCore2d1: dotnetcore2Dot1 = js.native
    
    @JSImport("@pulumi/aws", "lambda.Runtime.DotnetCore3d1")
    @js.native
    val DotnetCore3d1: dotnetcore3Dot1 = js.native
    
    @JSImport("@pulumi/aws", "lambda.Runtime.Go1dx")
    @js.native
    val Go1dx: go1Dotx = js.native
    
    @JSImport("@pulumi/aws", "lambda.Runtime.Java11")
    @js.native
    val Java11: java11 = js.native
    
    @JSImport("@pulumi/aws", "lambda.Runtime.Java8")
    @js.native
    val Java8: java8 = js.native
    
    @JSImport("@pulumi/aws", "lambda.Runtime.Java8AL2")
    @js.native
    val Java8AL2: java8Dotal2 = js.native
    
    @JSImport("@pulumi/aws", "lambda.Runtime.NodeJS10dX")
    @js.native
    val NodeJS10dX: nodejs10Dotx = js.native
    
    @JSImport("@pulumi/aws", "lambda.Runtime.NodeJS12dX")
    @js.native
    val NodeJS12dX: nodejs12Dotx = js.native
    
    @JSImport("@pulumi/aws", "lambda.Runtime.Python2d7")
    @js.native
    val Python2d7: python2Dot7 = js.native
    
    @JSImport("@pulumi/aws", "lambda.Runtime.Python3d6")
    @js.native
    val Python3d6: python3Dot6 = js.native
    
    @JSImport("@pulumi/aws", "lambda.Runtime.Python3d7")
    @js.native
    val Python3d7: python3Dot7 = js.native
    
    @JSImport("@pulumi/aws", "lambda.Runtime.Python3d8")
    @js.native
    val Python3d8: python3Dot8 = js.native
    
    @JSImport("@pulumi/aws", "lambda.Runtime.Ruby2d5")
    @js.native
    val Ruby2d5: ruby2Dot5 = js.native
    
    @JSImport("@pulumi/aws", "lambda.Runtime.Ruby2d7")
    @js.native
    val Ruby2d7: ruby2Dot7 = js.native
  }
  
  @JSImport("@pulumi/aws", "lambda.createFunctionFromEventHandler")
  @js.native
  def createFunctionFromEventHandler[E, R](name: String, handler: EventHandler[E, R]): typingsSlinky.pulumiAws.lambdaFunctionMod.Function = js.native
  @JSImport("@pulumi/aws", "lambda.createFunctionFromEventHandler")
  @js.native
  def createFunctionFromEventHandler[E, R](name: String, handler: EventHandler[E, R], opts: ResourceOptions): typingsSlinky.pulumiAws.lambdaFunctionMod.Function = js.native
  
  @JSImport("@pulumi/aws", "lambda.getAlias")
  @js.native
  def getAlias(args: GetAliasArgs): js.Promise[GetAliasResult] = js.native
  @JSImport("@pulumi/aws", "lambda.getAlias")
  @js.native
  def getAlias(args: GetAliasArgs, opts: InvokeOptions): js.Promise[GetAliasResult] = js.native
  
  @JSImport("@pulumi/aws", "lambda.getFunction")
  @js.native
  def getFunction(args: GetFunctionArgs): js.Promise[GetFunctionResult] = js.native
  @JSImport("@pulumi/aws", "lambda.getFunction")
  @js.native
  def getFunction(args: GetFunctionArgs, opts: InvokeOptions): js.Promise[GetFunctionResult] = js.native
  
  @JSImport("@pulumi/aws", "lambda.getInvocation")
  @js.native
  def getInvocation(args: GetInvocationArgs): js.Promise[GetInvocationResult] = js.native
  @JSImport("@pulumi/aws", "lambda.getInvocation")
  @js.native
  def getInvocation(args: GetInvocationArgs, opts: InvokeOptions): js.Promise[GetInvocationResult] = js.native
  
  @JSImport("@pulumi/aws", "lambda.getLayerVersion")
  @js.native
  def getLayerVersion(args: GetLayerVersionArgs): js.Promise[GetLayerVersionResult] = js.native
  @JSImport("@pulumi/aws", "lambda.getLayerVersion")
  @js.native
  def getLayerVersion(args: GetLayerVersionArgs, opts: InvokeOptions): js.Promise[GetLayerVersionResult] = js.native
  
  @JSImport("@pulumi/aws", "lambda.isEventHandler")
  @js.native
  def isEventHandler(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/lambda/lambdaMixins.EventHandler<any, any> */ Boolean = js.native
  
  /* augmented module */
  object pulumiAwsLambdaFunctionAugmentingMod {
    
    @js.native
    trait Function extends StObject {
      
      /**
        * Actual Role instance value for this Function.  Will only be set if this function was
        * created from [createFunction]
        */
      var roleInstance: js.UndefOr[Role] = js.native
    }
  }
}
