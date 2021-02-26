package typingsSlinky.activedirectory2

import typingsSlinky.activedirectory2.activedirectory2Booleans.`false`
import typingsSlinky.activedirectory2.activedirectory2Strings.cn
import typingsSlinky.activedirectory2.activedirectory2Strings.comment
import typingsSlinky.activedirectory2.activedirectory2Strings.description
import typingsSlinky.activedirectory2.activedirectory2Strings.displayName
import typingsSlinky.activedirectory2.activedirectory2Strings.distinguishedName
import typingsSlinky.activedirectory2.activedirectory2Strings.dn
import typingsSlinky.activedirectory2.activedirectory2Strings.employeeID
import typingsSlinky.activedirectory2.activedirectory2Strings.givenName
import typingsSlinky.activedirectory2.activedirectory2Strings.initials
import typingsSlinky.activedirectory2.activedirectory2Strings.ldapsQuestionmarkColonSlashSlashDomainDnsZonesBackslashDotDotAsteriskSlashDotAsterisk
import typingsSlinky.activedirectory2.activedirectory2Strings.ldapsQuestionmarkColonSlashSlashDotAsteriskSlashCNEqualssignConfigurationCommaDotAsterisk
import typingsSlinky.activedirectory2.activedirectory2Strings.ldapsQuestionmarkColonSlashSlashForestDnsZonesBackslashDotDotAsteriskSlashDotAsterisk
import typingsSlinky.activedirectory2.activedirectory2Strings.lockoutTime
import typingsSlinky.activedirectory2.activedirectory2Strings.mail
import typingsSlinky.activedirectory2.activedirectory2Strings.objectCategory
import typingsSlinky.activedirectory2.activedirectory2Strings.pwdLastSet
import typingsSlinky.activedirectory2.activedirectory2Strings.sAMAccountName
import typingsSlinky.activedirectory2.activedirectory2Strings.sn
import typingsSlinky.activedirectory2.activedirectory2Strings.userAccountControl
import typingsSlinky.activedirectory2.activedirectory2Strings.userPrincipalName
import typingsSlinky.activedirectory2.activedirectory2Strings.whenCreated
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait Ca extends StObject {
    
    var ca: js.UndefOr[String] = js.native
    
    var cert: js.UndefOr[String] = js.native
    
    var host: js.UndefOr[String] = js.native
    
    var key: js.UndefOr[String] = js.native
    
    var rejectUnauthorized: Boolean = js.native
  }
  object Ca {
    
    @scala.inline
    def apply(rejectUnauthorized: Boolean): Ca = {
      val __obj = js.Dynamic.literal(rejectUnauthorized = rejectUnauthorized.asInstanceOf[js.Any])
      __obj.asInstanceOf[Ca]
    }
    
    @scala.inline
    implicit class CaMutableBuilder[Self <: Ca] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCa(value: String): Self = StObject.set(x, "ca", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCaUndefined: Self = StObject.set(x, "ca", js.undefined)
      
      @scala.inline
      def setCert(value: String): Self = StObject.set(x, "cert", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCertUndefined: Self = StObject.set(x, "cert", js.undefined)
      
      @scala.inline
      def setHost(value: String): Self = StObject.set(x, "host", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHostUndefined: Self = StObject.set(x, "host", js.undefined)
      
      @scala.inline
      def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
      
      @scala.inline
      def setRejectUnauthorized(value: Boolean): Self = StObject.set(x, "rejectUnauthorized", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Enabled extends StObject {
    
    var enabled: `false` = js.native
    
    var exclude: js.Tuple3[
        ldapsQuestionmarkColonSlashSlashForestDnsZonesBackslashDotDotAsteriskSlashDotAsterisk, 
        ldapsQuestionmarkColonSlashSlashDomainDnsZonesBackslashDotDotAsteriskSlashDotAsterisk, 
        ldapsQuestionmarkColonSlashSlashDotAsteriskSlashCNEqualssignConfigurationCommaDotAsterisk
      ] = js.native
  }
  object Enabled {
    
    @scala.inline
    def apply(
      enabled: `false`,
      exclude: js.Tuple3[
          ldapsQuestionmarkColonSlashSlashForestDnsZonesBackslashDotDotAsteriskSlashDotAsterisk, 
          ldapsQuestionmarkColonSlashSlashDomainDnsZonesBackslashDotDotAsteriskSlashDotAsterisk, 
          ldapsQuestionmarkColonSlashSlashDotAsteriskSlashCNEqualssignConfigurationCommaDotAsterisk
        ]
    ): Enabled = {
      val __obj = js.Dynamic.literal(enabled = enabled.asInstanceOf[js.Any], exclude = exclude.asInstanceOf[js.Any])
      __obj.asInstanceOf[Enabled]
    }
    
    @scala.inline
    implicit class EnabledMutableBuilder[Self <: Enabled] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setEnabled(value: `false`): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExclude(
        value: js.Tuple3[
              ldapsQuestionmarkColonSlashSlashForestDnsZonesBackslashDotDotAsteriskSlashDotAsterisk, 
              ldapsQuestionmarkColonSlashSlashDomainDnsZonesBackslashDotDotAsteriskSlashDotAsterisk, 
              ldapsQuestionmarkColonSlashSlashDotAsteriskSlashCNEqualssignConfigurationCommaDotAsterisk
            ]
      ): Self = StObject.set(x, "exclude", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Group extends StObject {
    
    var group: js.Tuple5[dn, cn, description, distinguishedName, objectCategory] = js.native
    
    var user: js.Tuple17[
        dn, 
        distinguishedName, 
        userPrincipalName, 
        sAMAccountName, 
        mail, 
        lockoutTime, 
        whenCreated, 
        pwdLastSet, 
        userAccountControl, 
        employeeID, 
        sn, 
        givenName, 
        initials, 
        cn, 
        displayName, 
        comment, 
        description
      ] = js.native
  }
  object Group {
    
    @scala.inline
    def apply(
      group: js.Tuple5[dn, cn, description, distinguishedName, objectCategory],
      user: js.Tuple17[
          dn, 
          distinguishedName, 
          userPrincipalName, 
          sAMAccountName, 
          mail, 
          lockoutTime, 
          whenCreated, 
          pwdLastSet, 
          userAccountControl, 
          employeeID, 
          sn, 
          givenName, 
          initials, 
          cn, 
          displayName, 
          comment, 
          description
        ]
    ): Group = {
      val __obj = js.Dynamic.literal(group = group.asInstanceOf[js.Any], user = user.asInstanceOf[js.Any])
      __obj.asInstanceOf[Group]
    }
    
    @scala.inline
    implicit class GroupMutableBuilder[Self <: Group] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setGroup(value: js.Tuple5[dn, cn, description, distinguishedName, objectCategory]): Self = StObject.set(x, "group", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUser(
        value: js.Tuple17[
              dn, 
              distinguishedName, 
              userPrincipalName, 
              sAMAccountName, 
              mail, 
              lockoutTime, 
              whenCreated, 
              pwdLastSet, 
              userAccountControl, 
              employeeID, 
              sn, 
              givenName, 
              initials, 
              cn, 
              displayName, 
              comment, 
              description
            ]
      ): Self = StObject.set(x, "user", value.asInstanceOf[js.Any])
    }
  }
}
