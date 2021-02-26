package typingsSlinky.pulumiAws

import typingsSlinky.pulumiPulumi.mod.CustomResource
import typingsSlinky.pulumiPulumi.outputMod.Input
import typingsSlinky.pulumiPulumi.outputMod.Output_
import typingsSlinky.pulumiPulumi.resourceMod.CustomResourceOptions
import typingsSlinky.pulumiPulumi.resourceMod.ID
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object smsPreferencesMod {
  
  @JSImport("@pulumi/aws/sns/smsPreferences", "SmsPreferences")
  @js.native
  class SmsPreferences protected () extends CustomResource {
    /**
      * Create a SmsPreferences resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String) = this()
    def this(name: String, args: SmsPreferencesArgs) = this()
    def this(name: String, args: js.UndefOr[scala.Nothing], opts: CustomResourceOptions) = this()
    def this(name: String, args: SmsPreferencesArgs, opts: CustomResourceOptions) = this()
    
    /**
      * A string, such as your business brand, that is displayed as the sender on the receiving device.
      */
    val defaultSenderId: Output_[js.UndefOr[String]] = js.native
    
    /**
      * The type of SMS message that you will send by default. Possible values are: Promotional, Transactional
      */
    val defaultSmsType: Output_[js.UndefOr[String]] = js.native
    
    /**
      * The ARN of the IAM role that allows Amazon SNS to write logs about SMS deliveries in CloudWatch Logs.
      */
    val deliveryStatusIamRoleArn: Output_[js.UndefOr[String]] = js.native
    
    /**
      * The percentage of successful SMS deliveries for which Amazon SNS will write logs in CloudWatch Logs. The value must be between 0 and 100.
      */
    val deliveryStatusSuccessSamplingRate: Output_[js.UndefOr[String]] = js.native
    
    /**
      * The maximum amount in USD that you are willing to spend each month to send SMS messages.
      */
    val monthlySpendLimit: Output_[js.UndefOr[String]] = js.native
    
    /**
      * The name of the Amazon S3 bucket to receive daily SMS usage reports from Amazon SNS.
      */
    val usageReportS3Bucket: Output_[js.UndefOr[String]] = js.native
  }
  /* static members */
  object SmsPreferences {
    
    /**
      * Get an existing SmsPreferences resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @JSImport("@pulumi/aws/sns/smsPreferences", "SmsPreferences.get")
    @js.native
    def get(name: String, id: Input[ID]): SmsPreferences = js.native
    @JSImport("@pulumi/aws/sns/smsPreferences", "SmsPreferences.get")
    @js.native
    def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): SmsPreferences = js.native
    @JSImport("@pulumi/aws/sns/smsPreferences", "SmsPreferences.get")
    @js.native
    def get(name: String, id: Input[ID], state: SmsPreferencesState): SmsPreferences = js.native
    @JSImport("@pulumi/aws/sns/smsPreferences", "SmsPreferences.get")
    @js.native
    def get(name: String, id: Input[ID], state: SmsPreferencesState, opts: CustomResourceOptions): SmsPreferences = js.native
    
    /**
      * Returns true if the given object is an instance of SmsPreferences.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @JSImport("@pulumi/aws/sns/smsPreferences", "SmsPreferences.isInstance")
    @js.native
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/sns/smsPreferences.SmsPreferences */ Boolean = js.native
  }
  
  @js.native
  trait SmsPreferencesArgs extends StObject {
    
    /**
      * A string, such as your business brand, that is displayed as the sender on the receiving device.
      */
    val defaultSenderId: js.UndefOr[Input[String]] = js.native
    
    /**
      * The type of SMS message that you will send by default. Possible values are: Promotional, Transactional
      */
    val defaultSmsType: js.UndefOr[Input[String]] = js.native
    
    /**
      * The ARN of the IAM role that allows Amazon SNS to write logs about SMS deliveries in CloudWatch Logs.
      */
    val deliveryStatusIamRoleArn: js.UndefOr[Input[String]] = js.native
    
    /**
      * The percentage of successful SMS deliveries for which Amazon SNS will write logs in CloudWatch Logs. The value must be between 0 and 100.
      */
    val deliveryStatusSuccessSamplingRate: js.UndefOr[Input[String]] = js.native
    
    /**
      * The maximum amount in USD that you are willing to spend each month to send SMS messages.
      */
    val monthlySpendLimit: js.UndefOr[Input[String]] = js.native
    
    /**
      * The name of the Amazon S3 bucket to receive daily SMS usage reports from Amazon SNS.
      */
    val usageReportS3Bucket: js.UndefOr[Input[String]] = js.native
  }
  object SmsPreferencesArgs {
    
    @scala.inline
    def apply(): SmsPreferencesArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SmsPreferencesArgs]
    }
    
    @scala.inline
    implicit class SmsPreferencesArgsMutableBuilder[Self <: SmsPreferencesArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDefaultSenderId(value: Input[String]): Self = StObject.set(x, "defaultSenderId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDefaultSenderIdUndefined: Self = StObject.set(x, "defaultSenderId", js.undefined)
      
      @scala.inline
      def setDefaultSmsType(value: Input[String]): Self = StObject.set(x, "defaultSmsType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDefaultSmsTypeUndefined: Self = StObject.set(x, "defaultSmsType", js.undefined)
      
      @scala.inline
      def setDeliveryStatusIamRoleArn(value: Input[String]): Self = StObject.set(x, "deliveryStatusIamRoleArn", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDeliveryStatusIamRoleArnUndefined: Self = StObject.set(x, "deliveryStatusIamRoleArn", js.undefined)
      
      @scala.inline
      def setDeliveryStatusSuccessSamplingRate(value: Input[String]): Self = StObject.set(x, "deliveryStatusSuccessSamplingRate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDeliveryStatusSuccessSamplingRateUndefined: Self = StObject.set(x, "deliveryStatusSuccessSamplingRate", js.undefined)
      
      @scala.inline
      def setMonthlySpendLimit(value: Input[String]): Self = StObject.set(x, "monthlySpendLimit", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMonthlySpendLimitUndefined: Self = StObject.set(x, "monthlySpendLimit", js.undefined)
      
      @scala.inline
      def setUsageReportS3Bucket(value: Input[String]): Self = StObject.set(x, "usageReportS3Bucket", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUsageReportS3BucketUndefined: Self = StObject.set(x, "usageReportS3Bucket", js.undefined)
    }
  }
  
  @js.native
  trait SmsPreferencesState extends StObject {
    
    /**
      * A string, such as your business brand, that is displayed as the sender on the receiving device.
      */
    val defaultSenderId: js.UndefOr[Input[String]] = js.native
    
    /**
      * The type of SMS message that you will send by default. Possible values are: Promotional, Transactional
      */
    val defaultSmsType: js.UndefOr[Input[String]] = js.native
    
    /**
      * The ARN of the IAM role that allows Amazon SNS to write logs about SMS deliveries in CloudWatch Logs.
      */
    val deliveryStatusIamRoleArn: js.UndefOr[Input[String]] = js.native
    
    /**
      * The percentage of successful SMS deliveries for which Amazon SNS will write logs in CloudWatch Logs. The value must be between 0 and 100.
      */
    val deliveryStatusSuccessSamplingRate: js.UndefOr[Input[String]] = js.native
    
    /**
      * The maximum amount in USD that you are willing to spend each month to send SMS messages.
      */
    val monthlySpendLimit: js.UndefOr[Input[String]] = js.native
    
    /**
      * The name of the Amazon S3 bucket to receive daily SMS usage reports from Amazon SNS.
      */
    val usageReportS3Bucket: js.UndefOr[Input[String]] = js.native
  }
  object SmsPreferencesState {
    
    @scala.inline
    def apply(): SmsPreferencesState = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SmsPreferencesState]
    }
    
    @scala.inline
    implicit class SmsPreferencesStateMutableBuilder[Self <: SmsPreferencesState] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDefaultSenderId(value: Input[String]): Self = StObject.set(x, "defaultSenderId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDefaultSenderIdUndefined: Self = StObject.set(x, "defaultSenderId", js.undefined)
      
      @scala.inline
      def setDefaultSmsType(value: Input[String]): Self = StObject.set(x, "defaultSmsType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDefaultSmsTypeUndefined: Self = StObject.set(x, "defaultSmsType", js.undefined)
      
      @scala.inline
      def setDeliveryStatusIamRoleArn(value: Input[String]): Self = StObject.set(x, "deliveryStatusIamRoleArn", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDeliveryStatusIamRoleArnUndefined: Self = StObject.set(x, "deliveryStatusIamRoleArn", js.undefined)
      
      @scala.inline
      def setDeliveryStatusSuccessSamplingRate(value: Input[String]): Self = StObject.set(x, "deliveryStatusSuccessSamplingRate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDeliveryStatusSuccessSamplingRateUndefined: Self = StObject.set(x, "deliveryStatusSuccessSamplingRate", js.undefined)
      
      @scala.inline
      def setMonthlySpendLimit(value: Input[String]): Self = StObject.set(x, "monthlySpendLimit", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMonthlySpendLimitUndefined: Self = StObject.set(x, "monthlySpendLimit", js.undefined)
      
      @scala.inline
      def setUsageReportS3Bucket(value: Input[String]): Self = StObject.set(x, "usageReportS3Bucket", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUsageReportS3BucketUndefined: Self = StObject.set(x, "usageReportS3Bucket", js.undefined)
    }
  }
}
