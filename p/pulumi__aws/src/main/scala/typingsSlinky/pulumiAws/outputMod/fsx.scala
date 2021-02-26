package typingsSlinky.pulumiAws.outputMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object fsx {
  
  @js.native
  trait WindowsFileSystemSelfManagedActiveDirectory extends StObject {
    
    /**
      * A list of up to two IP addresses of DNS servers or domain controllers in the self-managed AD directory. The IP addresses need to be either in the same VPC CIDR range as the file system or in the private IP version 4 (IPv4) address ranges as specified in [RFC 1918](https://tools.ietf.org/html/rfc1918).
      */
    var dnsIps: js.Array[String] = js.native
    
    /**
      * The fully qualified domain name of the self-managed AD directory. For example, `corp.example.com`.
      */
    var domainName: String = js.native
    
    /**
      * The name of the domain group whose members are granted administrative privileges for the file system. Administrative privileges include taking ownership of files and folders, and setting audit controls (audit ACLs) on files and folders. The group that you specify must already exist in your domain. Defaults to `Domain Admins`.
      */
    var fileSystemAdministratorsGroup: js.UndefOr[String] = js.native
    
    /**
      * The fully qualified distinguished name of the organizational unit within your self-managed AD directory that the Windows File Server instance will join. For example, `OU=FSx,DC=yourdomain,DC=corp,DC=com`. Only accepts OU as the direct parent of the file system. If none is provided, the FSx file system is created in the default location of your self-managed AD directory. To learn more, see [RFC 2253](https://tools.ietf.org/html/rfc2253).
      */
    var organizationalUnitDistinguishedName: js.UndefOr[String] = js.native
    
    /**
      * The password for the service account on your self-managed AD domain that Amazon FSx will use to join to your AD domain.
      */
    var password: String = js.native
    
    /**
      * The user name for the service account on your self-managed AD domain that Amazon FSx will use to join to your AD domain.
      */
    var username: String = js.native
  }
  object WindowsFileSystemSelfManagedActiveDirectory {
    
    @scala.inline
    def apply(dnsIps: js.Array[String], domainName: String, password: String, username: String): WindowsFileSystemSelfManagedActiveDirectory = {
      val __obj = js.Dynamic.literal(dnsIps = dnsIps.asInstanceOf[js.Any], domainName = domainName.asInstanceOf[js.Any], password = password.asInstanceOf[js.Any], username = username.asInstanceOf[js.Any])
      __obj.asInstanceOf[WindowsFileSystemSelfManagedActiveDirectory]
    }
    
    @scala.inline
    implicit class WindowsFileSystemSelfManagedActiveDirectoryMutableBuilder[Self <: WindowsFileSystemSelfManagedActiveDirectory] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDnsIps(value: js.Array[String]): Self = StObject.set(x, "dnsIps", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDnsIpsVarargs(value: String*): Self = StObject.set(x, "dnsIps", js.Array(value :_*))
      
      @scala.inline
      def setDomainName(value: String): Self = StObject.set(x, "domainName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFileSystemAdministratorsGroup(value: String): Self = StObject.set(x, "fileSystemAdministratorsGroup", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFileSystemAdministratorsGroupUndefined: Self = StObject.set(x, "fileSystemAdministratorsGroup", js.undefined)
      
      @scala.inline
      def setOrganizationalUnitDistinguishedName(value: String): Self = StObject.set(x, "organizationalUnitDistinguishedName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOrganizationalUnitDistinguishedNameUndefined: Self = StObject.set(x, "organizationalUnitDistinguishedName", js.undefined)
      
      @scala.inline
      def setPassword(value: String): Self = StObject.set(x, "password", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUsername(value: String): Self = StObject.set(x, "username", value.asInstanceOf[js.Any])
    }
  }
}
