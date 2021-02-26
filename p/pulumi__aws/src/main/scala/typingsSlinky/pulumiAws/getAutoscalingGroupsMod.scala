package typingsSlinky.pulumiAws

import typingsSlinky.pulumiAws.inputMod.GetAutoscalingGroupsFilter
import typingsSlinky.pulumiPulumi.invokeMod.InvokeOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object getAutoscalingGroupsMod {
  
  @JSImport("@pulumi/aws/getAutoscalingGroups", "getAutoscalingGroups")
  @js.native
  def getAutoscalingGroups(): js.Promise[GetAutoscalingGroupsResult] = js.native
  @JSImport("@pulumi/aws/getAutoscalingGroups", "getAutoscalingGroups")
  @js.native
  def getAutoscalingGroups(args: js.UndefOr[scala.Nothing], opts: InvokeOptions): js.Promise[GetAutoscalingGroupsResult] = js.native
  @JSImport("@pulumi/aws/getAutoscalingGroups", "getAutoscalingGroups")
  @js.native
  def getAutoscalingGroups(args: GetAutoscalingGroupsArgs): js.Promise[GetAutoscalingGroupsResult] = js.native
  @JSImport("@pulumi/aws/getAutoscalingGroups", "getAutoscalingGroups")
  @js.native
  def getAutoscalingGroups(args: GetAutoscalingGroupsArgs, opts: InvokeOptions): js.Promise[GetAutoscalingGroupsResult] = js.native
  
  @js.native
  trait GetAutoscalingGroupsArgs extends StObject {
    
    /**
      * A filter used to scope the list e.g. by tags. See [related docs](http://docs.aws.amazon.com/AutoScaling/latest/APIReference/API_Filter.html).
      */
    val filters: js.UndefOr[js.Array[GetAutoscalingGroupsFilter]] = js.native
  }
  object GetAutoscalingGroupsArgs {
    
    @scala.inline
    def apply(): GetAutoscalingGroupsArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[GetAutoscalingGroupsArgs]
    }
    
    @scala.inline
    implicit class GetAutoscalingGroupsArgsMutableBuilder[Self <: GetAutoscalingGroupsArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFilters(value: js.Array[GetAutoscalingGroupsFilter]): Self = StObject.set(x, "filters", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFiltersUndefined: Self = StObject.set(x, "filters", js.undefined)
      
      @scala.inline
      def setFiltersVarargs(value: GetAutoscalingGroupsFilter*): Self = StObject.set(x, "filters", js.Array(value :_*))
    }
  }
  
  @js.native
  trait GetAutoscalingGroupsResult extends StObject {
    
    /**
      * A list of the Autoscaling Groups Arns in the current region.
      */
    val arns: js.Array[String] = js.native
    
    val filters: js.UndefOr[js.Array[typingsSlinky.pulumiAws.outputMod.GetAutoscalingGroupsFilter]] = js.native
    
    /**
      * The provider-assigned unique ID for this managed resource.
      */
    val id: String = js.native
    
    /**
      * A list of the Autoscaling Groups in the current region.
      */
    val names: js.Array[String] = js.native
  }
  object GetAutoscalingGroupsResult {
    
    @scala.inline
    def apply(arns: js.Array[String], id: String, names: js.Array[String]): GetAutoscalingGroupsResult = {
      val __obj = js.Dynamic.literal(arns = arns.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], names = names.asInstanceOf[js.Any])
      __obj.asInstanceOf[GetAutoscalingGroupsResult]
    }
    
    @scala.inline
    implicit class GetAutoscalingGroupsResultMutableBuilder[Self <: GetAutoscalingGroupsResult] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setArns(value: js.Array[String]): Self = StObject.set(x, "arns", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setArnsVarargs(value: String*): Self = StObject.set(x, "arns", js.Array(value :_*))
      
      @scala.inline
      def setFilters(value: js.Array[typingsSlinky.pulumiAws.outputMod.GetAutoscalingGroupsFilter]): Self = StObject.set(x, "filters", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFiltersUndefined: Self = StObject.set(x, "filters", js.undefined)
      
      @scala.inline
      def setFiltersVarargs(value: typingsSlinky.pulumiAws.outputMod.GetAutoscalingGroupsFilter*): Self = StObject.set(x, "filters", js.Array(value :_*))
      
      @scala.inline
      def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNames(value: js.Array[String]): Self = StObject.set(x, "names", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNamesVarargs(value: String*): Self = StObject.set(x, "names", js.Array(value :_*))
    }
  }
}
