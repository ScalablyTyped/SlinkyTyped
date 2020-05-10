package typingsSlinky.next

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type GetServerSideProps[P /* <: org.scalablytyped.runtime.StringDictionary[js.Any] */] = js.Function1[
    /* context */ typingsSlinky.next.AnonPreview, 
    js.Promise[typingsSlinky.next.AnonPropsP[P]]
  ]
  type GetStaticPaths = js.Function0[js.Promise[typingsSlinky.next.AnonPaths]]
  type GetStaticProps[P /* <: org.scalablytyped.runtime.StringDictionary[js.Any] */] = js.Function1[
    /* ctx */ typingsSlinky.next.AnonParams, 
    js.Promise[typingsSlinky.next.AnonProps[P]]
  ]
  type NextPage[P, IP] = typingsSlinky.next.utilsMod.NextComponentType[typingsSlinky.next.utilsMod.NextPageContext, IP, P]
}
