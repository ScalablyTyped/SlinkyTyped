package typingsSlinky.activedirectory2

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
import scala.scalajs.js.annotation._

trait Anon_Cn extends js.Object {
  var group: js.Tuple5[dn, cn, description, distinguishedName, objectCategory]
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
  ]
}

object Anon_Cn {
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
  ): Anon_Cn = {
    val __obj = js.Dynamic.literal(group = group.asInstanceOf[js.Any], user = user.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_Cn]
  }
}

