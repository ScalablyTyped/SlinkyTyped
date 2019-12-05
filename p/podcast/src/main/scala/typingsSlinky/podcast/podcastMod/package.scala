package typingsSlinky.podcast

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object podcastMod {
  import typingsSlinky.podcast.Anon_FeedUrl
  import typingsSlinky.podcast.Anon_Feedurl
  import typingsSlinky.podcast.Anon_ImageUrl
  import typingsSlinky.podcast.Anon_Imageurl
  import typingsSlinky.podcast.Anon_SiteUrl
  import typingsSlinky.podcast.Anon_Siteurl

  type FeedOptions = BaseFeedOptions with (Anon_FeedUrl | Anon_Feedurl) with (Anon_SiteUrl | Anon_Siteurl) with (Anon_ImageUrl | Anon_Imageurl)
}
