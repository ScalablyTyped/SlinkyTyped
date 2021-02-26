package typingsSlinky.pulumiAws.inputMod

import typingsSlinky.pulumiPulumi.outputMod.Input
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object directoryservice {
  
  @js.native
  trait DirectoryConnectSettings extends StObject {
    
    var availabilityZones: js.UndefOr[Input[js.Array[Input[String]]]] = js.native
    
    /**
      * The IP addresses of the AD Connector servers.
      */
    var connectIps: js.UndefOr[Input[js.Array[Input[String]]]] = js.native
    
    /**
      * The DNS IP addresses of the domain to connect to.
      */
    var customerDnsIps: Input[js.Array[Input[String]]] = js.native
    
    /**
      * The username corresponding to the password provided.
      */
    var customerUsername: Input[String] = js.native
    
    /**
      * The identifiers of the subnets for the directory servers (2 subnets in 2 different AZs).
      */
    var subnetIds: Input[js.Array[Input[String]]] = js.native
    
    /**
      * The identifier of the VPC that the directory is in.
      */
    var vpcId: Input[String] = js.native
  }
  object DirectoryConnectSettings {
    
    @scala.inline
    def apply(
      customerDnsIps: Input[js.Array[Input[String]]],
      customerUsername: Input[String],
      subnetIds: Input[js.Array[Input[String]]],
      vpcId: Input[String]
    ): DirectoryConnectSettings = {
      val __obj = js.Dynamic.literal(customerDnsIps = customerDnsIps.asInstanceOf[js.Any], customerUsername = customerUsername.asInstanceOf[js.Any], subnetIds = subnetIds.asInstanceOf[js.Any], vpcId = vpcId.asInstanceOf[js.Any])
      __obj.asInstanceOf[DirectoryConnectSettings]
    }
    
    @scala.inline
    implicit class DirectoryConnectSettingsMutableBuilder[Self <: DirectoryConnectSettings] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAvailabilityZones(value: Input[js.Array[Input[String]]]): Self = StObject.set(x, "availabilityZones", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAvailabilityZonesUndefined: Self = StObject.set(x, "availabilityZones", js.undefined)
      
      @scala.inline
      def setAvailabilityZonesVarargs(value: Input[String]*): Self = StObject.set(x, "availabilityZones", js.Array(value :_*))
      
      @scala.inline
      def setConnectIps(value: Input[js.Array[Input[String]]]): Self = StObject.set(x, "connectIps", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setConnectIpsUndefined: Self = StObject.set(x, "connectIps", js.undefined)
      
      @scala.inline
      def setConnectIpsVarargs(value: Input[String]*): Self = StObject.set(x, "connectIps", js.Array(value :_*))
      
      @scala.inline
      def setCustomerDnsIps(value: Input[js.Array[Input[String]]]): Self = StObject.set(x, "customerDnsIps", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCustomerDnsIpsVarargs(value: Input[String]*): Self = StObject.set(x, "customerDnsIps", js.Array(value :_*))
      
      @scala.inline
      def setCustomerUsername(value: Input[String]): Self = StObject.set(x, "customerUsername", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSubnetIds(value: Input[js.Array[Input[String]]]): Self = StObject.set(x, "subnetIds", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSubnetIdsVarargs(value: Input[String]*): Self = StObject.set(x, "subnetIds", js.Array(value :_*))
      
      @scala.inline
      def setVpcId(value: Input[String]): Self = StObject.set(x, "vpcId", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait DirectoryVpcSettings extends StObject {
    
    var availabilityZones: js.UndefOr[Input[js.Array[Input[String]]]] = js.native
    
    /**
      * The identifiers of the subnets for the directory servers (2 subnets in 2 different AZs).
      */
    var subnetIds: Input[js.Array[Input[String]]] = js.native
    
    /**
      * The identifier of the VPC that the directory is in.
      */
    var vpcId: Input[String] = js.native
  }
  object DirectoryVpcSettings {
    
    @scala.inline
    def apply(subnetIds: Input[js.Array[Input[String]]], vpcId: Input[String]): DirectoryVpcSettings = {
      val __obj = js.Dynamic.literal(subnetIds = subnetIds.asInstanceOf[js.Any], vpcId = vpcId.asInstanceOf[js.Any])
      __obj.asInstanceOf[DirectoryVpcSettings]
    }
    
    @scala.inline
    implicit class DirectoryVpcSettingsMutableBuilder[Self <: DirectoryVpcSettings] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAvailabilityZones(value: Input[js.Array[Input[String]]]): Self = StObject.set(x, "availabilityZones", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAvailabilityZonesUndefined: Self = StObject.set(x, "availabilityZones", js.undefined)
      
      @scala.inline
      def setAvailabilityZonesVarargs(value: Input[String]*): Self = StObject.set(x, "availabilityZones", js.Array(value :_*))
      
      @scala.inline
      def setSubnetIds(value: Input[js.Array[Input[String]]]): Self = StObject.set(x, "subnetIds", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSubnetIdsVarargs(value: Input[String]*): Self = StObject.set(x, "subnetIds", js.Array(value :_*))
      
      @scala.inline
      def setVpcId(value: Input[String]): Self = StObject.set(x, "vpcId", value.asInstanceOf[js.Any])
    }
  }
}
