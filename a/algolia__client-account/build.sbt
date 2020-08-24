organization := "org.scalablytyped.slinky"
name := "algolia__client-account"
version := "4.3.1-0e35d0"
scalaVersion := "2.13.3"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "me.shadaj" %%% "slinky-web" % "0.6.5",
  "org.scalablytyped.slinky" %%% "algolia__cache-common" % "4.3.1-d63e5d",
  "org.scalablytyped.slinky" %%% "algolia__client-common" % "4.3.1-7db342",
  "org.scalablytyped.slinky" %%% "algolia__client-search" % "4.3.1-942bf9",
  "org.scalablytyped.slinky" %%% "algolia__logger-common" % "4.3.1-2e246e",
  "org.scalablytyped.slinky" %%% "algolia__requester-common" % "4.3.1-38666d",
  "org.scalablytyped.slinky" %%% "algolia__transporter" % "4.3.1-792dcb",
  "org.scalablytyped.slinky" %%% "std" % "3.9-88d6d8")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-g:notailcalls", "-language:implicitConversions", "-language:higherKinds", "-language:existentials")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
