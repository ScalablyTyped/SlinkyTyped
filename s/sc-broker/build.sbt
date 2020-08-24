organization := "org.scalablytyped.slinky"
name := "sc-broker"
version := "8.0-dt-20200519Z-86ac0f"
scalaVersion := "2.13.3"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "me.shadaj" %%% "slinky-web" % "0.6.5",
  "org.scalablytyped.slinky" %%% "expirymanager" % "0.9-dt-20181130Z-7640ec",
  "org.scalablytyped.slinky" %%% "fleximap" % "0.9-dt-20181205Z-3ef522",
  "org.scalablytyped.slinky" %%% "ncom" % "1.0-dt-20200205Z-eecb5f",
  "org.scalablytyped.slinky" %%% "node" % "14.0-dt-20200724Z-df8c17",
  "org.scalablytyped.slinky" %%% "std" % "3.9-88d6d8")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-g:notailcalls", "-language:implicitConversions", "-language:higherKinds", "-language:existentials")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
