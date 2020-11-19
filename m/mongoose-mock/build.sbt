organization := "org.scalablytyped.slinky"
name := "mongoose-mock"
version := "0.4.0-dt-20200515Z-433fb1"
scalaVersion := "2.13.3"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "me.shadaj" %%% "slinky-web" % "0.6.6",
  "org.scalablytyped.slinky" %%% "bson" % "4.0-dt-20200515Z-62bbfd",
  "org.scalablytyped.slinky" %%% "mongodb" % "3.5-dt-20200624Z-897802",
  "org.scalablytyped.slinky" %%% "mongoose" % "5.7.13-dt-20200715Z-2eaa90",
  "org.scalablytyped.slinky" %%% "node" % "14.0-dt-20200724Z-8c2fed",
  "org.scalablytyped.slinky" %%% "std" % "3.9-38a9bf")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-g:notailcalls", "-language:implicitConversions", "-language:higherKinds", "-language:existentials")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
