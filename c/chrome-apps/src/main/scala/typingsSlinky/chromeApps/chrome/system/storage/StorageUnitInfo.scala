package typingsSlinky.chromeApps.chrome.system.storage

import typingsSlinky.chromeApps.anon.FIXED
import typingsSlinky.chromeApps.chrome.ToStringLiteral
import typingsSlinky.chromeApps.chrome.integer
import typingsSlinky.chromeApps.chromeAppsStrings.REMOVABLE
import typingsSlinky.chromeApps.chromeAppsStrings.UNKNOWN
import typingsSlinky.chromeApps.chromeAppsStrings.fixed_
import typingsSlinky.chromeApps.chromeAppsStrings.removable_
import typingsSlinky.chromeApps.chromeAppsStrings.unknown__
import typingsSlinky.std.Exclude
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StorageUnitInfo extends js.Object {
  /** The total amount of the storage space, in bytes. */
  var capacity: integer = js.native
  /**
    * The transient ID that uniquely identifies the storage device.
    * This ID will be persistent within the same run of a single application.
    * It will not be a persistent identifier between different runs of an application, or between different applications.
    */
  var id: String = js.native
  /** The name of the storage unit. */
  var name: String = js.native
  /**
    * The media type of the storage unit.
    * fixed: The storage has fixed media, e.g. hard disk or SSD.
    * removable: The storage is removable, e.g. USB flash drive.
    * unknown: The storage type is unknown.
    * @see enum StorageUnitType
    */
  var `type`: ToStringLiteral[
    FIXED, 
    /* keyof chrome-apps.anon.FIXED */ typingsSlinky.chromeApps.chromeAppsStrings.FIXED | REMOVABLE | UNKNOWN, 
    Exclude[
      /* keyof chrome-apps.anon.FIXED */ typingsSlinky.chromeApps.chromeAppsStrings.FIXED | REMOVABLE | UNKNOWN, 
      fixed_ | removable_ | unknown__
    ]
  ] = js.native
}

object StorageUnitInfo {
  @scala.inline
  def apply(
    capacity: integer,
    id: String,
    name: String,
    `type`: ToStringLiteral[
      FIXED, 
      /* keyof chrome-apps.anon.FIXED */ typingsSlinky.chromeApps.chromeAppsStrings.FIXED | REMOVABLE | UNKNOWN, 
      Exclude[
        /* keyof chrome-apps.anon.FIXED */ typingsSlinky.chromeApps.chromeAppsStrings.FIXED | REMOVABLE | UNKNOWN, 
        fixed_ | removable_ | unknown__
      ]
    ]
  ): StorageUnitInfo = {
    val __obj = js.Dynamic.literal(capacity = capacity.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[StorageUnitInfo]
  }
  @scala.inline
  implicit class StorageUnitInfoOps[Self <: StorageUnitInfo] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCapacity(value: integer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("capacity")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withType(
      value: ToStringLiteral[
          FIXED, 
          /* keyof chrome-apps.anon.FIXED */ typingsSlinky.chromeApps.chromeAppsStrings.FIXED | REMOVABLE | UNKNOWN, 
          Exclude[
            /* keyof chrome-apps.anon.FIXED */ typingsSlinky.chromeApps.chromeAppsStrings.FIXED | REMOVABLE | UNKNOWN, 
            fixed_ | removable_ | unknown__
          ]
        ]
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

