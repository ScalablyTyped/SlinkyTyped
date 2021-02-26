package typingsSlinky.pulumiAws

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.pulumiAws.inputMod.ram.GetResourceShareFilter
import typingsSlinky.pulumiPulumi.invokeMod.InvokeOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object getResourceShareMod {
  
  @JSImport("@pulumi/aws/ram/getResourceShare", "getResourceShare")
  @js.native
  def getResourceShare(args: GetResourceShareArgs): js.Promise[GetResourceShareResult] = js.native
  @JSImport("@pulumi/aws/ram/getResourceShare", "getResourceShare")
  @js.native
  def getResourceShare(args: GetResourceShareArgs, opts: InvokeOptions): js.Promise[GetResourceShareResult] = js.native
  
  @js.native
  trait GetResourceShareArgs extends StObject {
    
    /**
      * A filter used to scope the list e.g. by tags. See [related docs] (https://docs.aws.amazon.com/ram/latest/APIReference/API_TagFilter.html).
      */
    val filters: js.UndefOr[js.Array[GetResourceShareFilter]] = js.native
    
    /**
      * The name of the tag key to filter on.
      */
    val name: String = js.native
    
    /**
      * The owner of the resource share. Valid values are SELF or OTHER-ACCOUNTS
      */
    val resourceOwner: String = js.native
    
    /**
      * The Tags attached to the RAM share
      */
    val tags: js.UndefOr[StringDictionary[String]] = js.native
  }
  object GetResourceShareArgs {
    
    @scala.inline
    def apply(name: String, resourceOwner: String): GetResourceShareArgs = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], resourceOwner = resourceOwner.asInstanceOf[js.Any])
      __obj.asInstanceOf[GetResourceShareArgs]
    }
    
    @scala.inline
    implicit class GetResourceShareArgsMutableBuilder[Self <: GetResourceShareArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFilters(value: js.Array[GetResourceShareFilter]): Self = StObject.set(x, "filters", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFiltersUndefined: Self = StObject.set(x, "filters", js.undefined)
      
      @scala.inline
      def setFiltersVarargs(value: GetResourceShareFilter*): Self = StObject.set(x, "filters", js.Array(value :_*))
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setResourceOwner(value: String): Self = StObject.set(x, "resourceOwner", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTags(value: StringDictionary[String]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
    }
  }
  
  @js.native
  trait GetResourceShareResult extends StObject {
    
    /**
      * The Amazon Resource Name (ARN) of the resource share.
      */
    val arn: String = js.native
    
    val filters: js.UndefOr[js.Array[typingsSlinky.pulumiAws.outputMod.ram.GetResourceShareFilter]] = js.native
    
    /**
      * The provider-assigned unique ID for this managed resource.
      */
    val id: String = js.native
    
    val name: String = js.native
    
    /**
      * The ID of the AWS account that owns the resource share.
      */
    val owningAccountId: String = js.native
    
    val resourceOwner: String = js.native
    
    /**
      * The Status of the RAM share.
      */
    val status: String = js.native
    
    /**
      * The Tags attached to the RAM share
      */
    val tags: StringDictionary[String] = js.native
  }
  object GetResourceShareResult {
    
    @scala.inline
    def apply(
      arn: String,
      id: String,
      name: String,
      owningAccountId: String,
      resourceOwner: String,
      status: String,
      tags: StringDictionary[String]
    ): GetResourceShareResult = {
      val __obj = js.Dynamic.literal(arn = arn.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], owningAccountId = owningAccountId.asInstanceOf[js.Any], resourceOwner = resourceOwner.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], tags = tags.asInstanceOf[js.Any])
      __obj.asInstanceOf[GetResourceShareResult]
    }
    
    @scala.inline
    implicit class GetResourceShareResultMutableBuilder[Self <: GetResourceShareResult] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setArn(value: String): Self = StObject.set(x, "arn", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFilters(value: js.Array[typingsSlinky.pulumiAws.outputMod.ram.GetResourceShareFilter]): Self = StObject.set(x, "filters", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFiltersUndefined: Self = StObject.set(x, "filters", js.undefined)
      
      @scala.inline
      def setFiltersVarargs(value: typingsSlinky.pulumiAws.outputMod.ram.GetResourceShareFilter*): Self = StObject.set(x, "filters", js.Array(value :_*))
      
      @scala.inline
      def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOwningAccountId(value: String): Self = StObject.set(x, "owningAccountId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setResourceOwner(value: String): Self = StObject.set(x, "resourceOwner", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStatus(value: String): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTags(value: StringDictionary[String]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
    }
  }
}
