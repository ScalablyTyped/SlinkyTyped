organization := "org.scalablytyped.slinky"
name := "algoliasearch-helper"
version := "3.2.2-c9d1b7"
scalaVersion := "2.13.3"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "me.shadaj" %%% "slinky-web" % "0.6.6",
  "org.scalablytyped.slinky" %%% "algolia__cache-common" % "4.3.1-8b6774",
  "org.scalablytyped.slinky" %%% "algolia__client-analytics" % "4.3.1-e8a1c4",
  "org.scalablytyped.slinky" %%% "algolia__client-common" % "4.3.1-8f19c3",
  "org.scalablytyped.slinky" %%% "algolia__client-recommendation" % "4.3.1-209a8e",
  "org.scalablytyped.slinky" %%% "algolia__client-search" % "4.3.1-c1309c",
  "org.scalablytyped.slinky" %%% "algolia__logger-common" % "4.3.1-504c2f",
  "org.scalablytyped.slinky" %%% "algolia__requester-common" % "4.3.1-f8f529",
  "org.scalablytyped.slinky" %%% "algolia__transporter" % "4.3.1-189b56",
  "org.scalablytyped.slinky" %%% "algoliasearch" % "4.3.1-821c38",
  "org.scalablytyped.slinky" %%% "events" % "3.0-dt-20200515Z-c0e435",
  "org.scalablytyped.slinky" %%% "std" % "3.9-38a9bf")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-g:notailcalls", "-language:implicitConversions", "-language:higherKinds", "-language:existentials")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
