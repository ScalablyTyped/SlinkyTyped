package typingsSlinky.iitc.entityInfoMod

import typingsSlinky.iitc.iitcNumbers.`0`
import typingsSlinky.iitc.iitcNumbers.`1`
import typingsSlinky.iitc.iitcNumbers.`2`
import typingsSlinky.iitc.iitctypesMod.IITC.PortalData
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobalScope
@js.native
object global extends js.Object {
  
  /**
    * given the entity detail data, returns the team the entity belongs to. Uses TEAM_* enum values.
    */
  def getTeam(details: PortalData): `0` | `1` | `2` = js.native
  
  def teamStringToId(teamStr: String): `0` | `1` | `2` = js.native
}
