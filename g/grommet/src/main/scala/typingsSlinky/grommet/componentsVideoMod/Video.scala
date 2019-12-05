package typingsSlinky.grommet.componentsVideoMod

import org.scalablytyped.runtime.TopLevel
import typingsSlinky.grommet.grommetStrings.controls
import typingsSlinky.grommet.utilsMod.Omit
import typingsSlinky.react.reactMod.Component
import typingsSlinky.react.reactMod.ComponentClass
import typingsSlinky.react.reactMod.ComponentState
import typingsSlinky.react.reactMod.DetailedHTMLProps
import typingsSlinky.react.reactMod.VideoHTMLAttributes
import typingsSlinky.std.HTMLVideoElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("grommet/components/Video", "Video")
@js.native
class Video protected ()
  extends Component[
      VideoProps with (DetailedHTMLProps[VideoHTMLAttributes[HTMLVideoElement], HTMLVideoElement]) with (Omit[
        DetailedHTMLProps[VideoHTMLAttributes[HTMLVideoElement], HTMLVideoElement], 
        controls
      ]), 
      ComponentState, 
      js.Any
    ] {
  def this(props: VideoProps with (DetailedHTMLProps[
        VideoHTMLAttributes[org.scalajs.dom.raw.HTMLVideoElement], 
        org.scalajs.dom.raw.HTMLVideoElement
      ]) with (Omit[
        DetailedHTMLProps[
          VideoHTMLAttributes[org.scalajs.dom.raw.HTMLVideoElement], 
          org.scalajs.dom.raw.HTMLVideoElement
        ], 
        controls
      ])) = this()
  def this(
    props: VideoProps with (DetailedHTMLProps[
        VideoHTMLAttributes[org.scalajs.dom.raw.HTMLVideoElement], 
        org.scalajs.dom.raw.HTMLVideoElement
      ]) with (Omit[
        DetailedHTMLProps[
          VideoHTMLAttributes[org.scalajs.dom.raw.HTMLVideoElement], 
          org.scalajs.dom.raw.HTMLVideoElement
        ], 
        controls
      ]),
    context: js.Any
  ) = this()
}

@JSImport("grommet/components/Video", "Video")
@js.native
object Video extends TopLevel[
      ComponentClass[
        VideoProps with (DetailedHTMLProps[VideoHTMLAttributes[HTMLVideoElement], HTMLVideoElement]) with (Omit[
          DetailedHTMLProps[VideoHTMLAttributes[HTMLVideoElement], HTMLVideoElement], 
          controls
        ]), 
        ComponentState
      ]
    ]

