package typingsSlinky.next

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type GetServerSideProps[P /* <: org.scalablytyped.runtime.StringDictionary[js.Any] */] = js.Function1[
    /* context */ typingsSlinky.next.anon.Preview, 
    js.Promise[typingsSlinky.next.anon.PropsP[P]]
  ]
  type GetStaticPaths = js.Function0[js.Promise[typingsSlinky.next.anon.Paths]]
  type GetStaticProps[P /* <: org.scalablytyped.runtime.StringDictionary[js.Any] */] = js.Function1[
    /* ctx */ typingsSlinky.next.anon.Params, 
    js.Promise[typingsSlinky.next.anon.Props[P]]
  ]
  type NextPage[P, IP] = typingsSlinky.next.utilsMod.NextComponentType[typingsSlinky.next.utilsMod.NextPageContext, IP, P]
}
