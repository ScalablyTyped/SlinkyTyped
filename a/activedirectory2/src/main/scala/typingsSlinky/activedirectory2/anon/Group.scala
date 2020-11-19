package typingsSlinky.activedirectory2.anon

import typingsSlinky.activedirectory2.activedirectory2Strings.cn
import typingsSlinky.activedirectory2.activedirectory2Strings.comment
import typingsSlinky.activedirectory2.activedirectory2Strings.description
import typingsSlinky.activedirectory2.activedirectory2Strings.displayName
import typingsSlinky.activedirectory2.activedirectory2Strings.distinguishedName
import typingsSlinky.activedirectory2.activedirectory2Strings.dn
import typingsSlinky.activedirectory2.activedirectory2Strings.employeeID
import typingsSlinky.activedirectory2.activedirectory2Strings.givenName
import typingsSlinky.activedirectory2.activedirectory2Strings.initials
import typingsSlinky.activedirectory2.activedirectory2Strings.lockoutTime
import typingsSlinky.activedirectory2.activedirectory2Strings.mail
import typingsSlinky.activedirectory2.activedirectory2Strings.objectCategory
import typingsSlinky.activedirectory2.activedirectory2Strings.pwdLastSet
import typingsSlinky.activedirectory2.activedirectory2Strings.sAMAccountName
import typingsSlinky.activedirectory2.activedirectory2Strings.sn
import typingsSlinky.activedirectory2.activedirectory2Strings.userAccountControl
import typingsSlinky.activedirectory2.activedirectory2Strings.userPrincipalName
import typingsSlinky.activedirectory2.activedirectory2Strings.whenCreated
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Group extends js.Object {
  
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
  implicit class GroupOps[Self <: Group] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setGroup(value: js.Tuple5[dn, cn, description, distinguishedName, objectCategory]): Self = this.set("group", value.asInstanceOf[js.Any])
    
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
    ): Self = this.set("user", value.asInstanceOf[js.Any])
  }
}
