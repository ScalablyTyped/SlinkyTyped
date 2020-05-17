package typingsSlinky.activedirectory2.anon

import typingsSlinky.activedirectory2.activedirectory2Booleans.`false`
import typingsSlinky.activedirectory2.activedirectory2Strings.ldapsQuestionmarkColonSlashSlashDomainDnsZonesBackslashDotDotAsteriskSlashDotAsterisk
import typingsSlinky.activedirectory2.activedirectory2Strings.ldapsQuestionmarkColonSlashSlashDotAsteriskSlashCNEqualssignConfigurationCommaDotAsterisk
import typingsSlinky.activedirectory2.activedirectory2Strings.ldapsQuestionmarkColonSlashSlashForestDnsZonesBackslashDotDotAsteriskSlashDotAsterisk
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Enabled extends js.Object {
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
  implicit class EnabledOps[Self <: Enabled] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEnabled(value: `false`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withExclude(
      value: js.Tuple3[
          ldapsQuestionmarkColonSlashSlashForestDnsZonesBackslashDotDotAsteriskSlashDotAsterisk, 
          ldapsQuestionmarkColonSlashSlashDomainDnsZonesBackslashDotDotAsteriskSlashDotAsterisk, 
          ldapsQuestionmarkColonSlashSlashDotAsteriskSlashCNEqualssignConfigurationCommaDotAsterisk
        ]
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("exclude")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

