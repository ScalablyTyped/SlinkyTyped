package typingsSlinky.pulumiAws

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.pulumiAws.inputMod.ec2.GetSecurityGroupFilter
import typingsSlinky.pulumiPulumi.invokeMod.InvokeOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object getSecurityGroupMod {
  
  @JSImport("@pulumi/aws/ec2/getSecurityGroup", "getSecurityGroup")
  @js.native
  def getSecurityGroup(): js.Promise[GetSecurityGroupResult] = js.native
  @JSImport("@pulumi/aws/ec2/getSecurityGroup", "getSecurityGroup")
  @js.native
  def getSecurityGroup(args: js.UndefOr[scala.Nothing], opts: InvokeOptions): js.Promise[GetSecurityGroupResult] = js.native
  @JSImport("@pulumi/aws/ec2/getSecurityGroup", "getSecurityGroup")
  @js.native
  def getSecurityGroup(args: GetSecurityGroupArgs): js.Promise[GetSecurityGroupResult] = js.native
  @JSImport("@pulumi/aws/ec2/getSecurityGroup", "getSecurityGroup")
  @js.native
  def getSecurityGroup(args: GetSecurityGroupArgs, opts: InvokeOptions): js.Promise[GetSecurityGroupResult] = js.native
  
  @js.native
  trait GetSecurityGroupArgs extends StObject {
    
    /**
      * Custom filter block as described below.
      */
    val filters: js.UndefOr[js.Array[GetSecurityGroupFilter]] = js.native
    
    /**
      * The id of the specific security group to retrieve.
      */
    val id: js.UndefOr[String] = js.native
    
    /**
      * The name of the field to filter by, as defined by
      * [the underlying AWS API](http://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_DescribeSecurityGroups.html).
      */
    val name: js.UndefOr[String] = js.native
    
    /**
      * A map of tags, each pair of which must exactly match
      * a pair on the desired security group.
      */
    val tags: js.UndefOr[StringDictionary[String]] = js.native
    
    /**
      * The id of the VPC that the desired security group belongs to.
      */
    val vpcId: js.UndefOr[String] = js.native
  }
  object GetSecurityGroupArgs {
    
    @scala.inline
    def apply(): GetSecurityGroupArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[GetSecurityGroupArgs]
    }
    
    @scala.inline
    implicit class GetSecurityGroupArgsMutableBuilder[Self <: GetSecurityGroupArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFilters(value: js.Array[GetSecurityGroupFilter]): Self = StObject.set(x, "filters", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFiltersUndefined: Self = StObject.set(x, "filters", js.undefined)
      
      @scala.inline
      def setFiltersVarargs(value: GetSecurityGroupFilter*): Self = StObject.set(x, "filters", js.Array(value :_*))
      
      @scala.inline
      def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      @scala.inline
      def setTags(value: StringDictionary[String]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
      
      @scala.inline
      def setVpcId(value: String): Self = StObject.set(x, "vpcId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVpcIdUndefined: Self = StObject.set(x, "vpcId", js.undefined)
    }
  }
  
  @js.native
  trait GetSecurityGroupResult extends StObject {
    
    /**
      * The computed ARN of the security group.
      */
    val arn: String = js.native
    
    /**
      * The description of the security group.
      */
    val description: String = js.native
    
    val filters: js.UndefOr[js.Array[typingsSlinky.pulumiAws.outputMod.ec2.GetSecurityGroupFilter]] = js.native
    
    val id: String = js.native
    
    val name: String = js.native
    
    val tags: StringDictionary[String] = js.native
    
    val vpcId: String = js.native
  }
  object GetSecurityGroupResult {
    
    @scala.inline
    def apply(
      arn: String,
      description: String,
      id: String,
      name: String,
      tags: StringDictionary[String],
      vpcId: String
    ): GetSecurityGroupResult = {
      val __obj = js.Dynamic.literal(arn = arn.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], tags = tags.asInstanceOf[js.Any], vpcId = vpcId.asInstanceOf[js.Any])
      __obj.asInstanceOf[GetSecurityGroupResult]
    }
    
    @scala.inline
    implicit class GetSecurityGroupResultMutableBuilder[Self <: GetSecurityGroupResult] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setArn(value: String): Self = StObject.set(x, "arn", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFilters(value: js.Array[typingsSlinky.pulumiAws.outputMod.ec2.GetSecurityGroupFilter]): Self = StObject.set(x, "filters", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFiltersUndefined: Self = StObject.set(x, "filters", js.undefined)
      
      @scala.inline
      def setFiltersVarargs(value: typingsSlinky.pulumiAws.outputMod.ec2.GetSecurityGroupFilter*): Self = StObject.set(x, "filters", js.Array(value :_*))
      
      @scala.inline
      def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTags(value: StringDictionary[String]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVpcId(value: String): Self = StObject.set(x, "vpcId", value.asInstanceOf[js.Any])
    }
  }
}
